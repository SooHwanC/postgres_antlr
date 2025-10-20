parser grammar PlpgsqlParser;

options {
    tokenVocab = PlpgsqlLexer;
}

// Entry point
plpgsqlBlock
    : label? declareSection? BEGIN statementList exceptionSection? END label? SEMI?
    ;

// Label for blocks (e.g., << outerblock >>)
label
    : LABEL_START Identifier LABEL_END
    ;

// Declaration section
declareSection
    : DECLARE declarationList
    ;

declarationList
    : declaration+
    ;

declaration
    : Identifier CONSTANT? dataType (NOT NULL)? (ASSIGN expression | DEFAULT expression)? SEMI
    | Identifier CURSOR (LPAREN parameterList RPAREN)? (IS | FOR) selectStmt SEMI
    | Identifier ALIAS FOR (Identifier | DOLLAR IntegerLiteral) SEMI
    ;

dataType
    : INTEGER
    | BIGINT
    | SMALLINT
    | NUMERIC (LPAREN IntegerLiteral (COMMA IntegerLiteral)? RPAREN)?
    | DECIMAL (LPAREN IntegerLiteral (COMMA IntegerLiteral)? RPAREN)?
    | REAL
    | DOUBLE
    | VARCHAR (LPAREN IntegerLiteral RPAREN)?
    | CHAR (LPAREN IntegerLiteral RPAREN)?
    | TEXT
    | BOOLEAN
    | DATE
    | TIMESTAMP (LPAREN IntegerLiteral RPAREN)?
    | RECORD
    | Identifier (PERCENT (TYPE | ROWTYPE))?
    | dataType ARRAY (LBRACK RBRACK)?
    ;

// Statement list
statementList
    : statement*
    ;

statement
    : assignmentStmt
    | selectIntoStmt
    | performStmt
    | executeStmt
    | insertStmt
    | updateStmt
    | deleteStmt
    | ifStmt
    | caseStmt
    | loopStmt
    | whileStmt
    | forStmt
    | foreachStmt
    | exitStmt
    | continueStmt
    | returnStmt
    | raiseStmt
    | assertStmt
    | nullStmt
    | nestedBlock
    | getDiagnosticsStmt
    | openCursorStmt
    | closeCursorStmt
    | fetchStmt
    ;

// Assignment statement
assignmentStmt
    : variableRef ASSIGN expression SEMI
    ;

variableRef
    : Identifier (DOT Identifier)*
    | QuotedIdentifier (DOT QuotedIdentifier)*
    ;

// SELECT INTO statement
selectIntoStmt
    : SELECT selectList INTO STRICT? variableList fromClause? whereClause? SEMI
    ;

selectList
    : (STAR | expression (COMMA expression)*)
    ;

variableList
    : variableRef (COMMA variableRef)*
    ;

fromClause
    : FROM tableRef (COMMA tableRef)*
    ;

tableRef
    : Identifier (AS? Identifier)?
    ;

whereClause
    : WHERE expression
    ;

// PERFORM statement (SELECT without INTO)
performStmt
    : PERFORM selectList fromClause? whereClause? SEMI
    ;

// EXECUTE statement
executeStmt
    : EXECUTE expression (INTO variableList)? (USING expressionList)? SEMI
    ;

// INSERT statement
insertStmt
    : INSERT INTO Identifier (LPAREN columnList RPAREN)? VALUES LPAREN expressionList RPAREN SEMI
    ;

columnList
    : Identifier (COMMA Identifier)*
    ;

expressionList
    : expression (COMMA expression)*
    ;

// UPDATE statement
updateStmt
    : UPDATE Identifier SET assignmentList whereClause? SEMI
    ;

assignmentList
    : columnAssignment (COMMA columnAssignment)*
    ;

columnAssignment
    : Identifier EQ expression
    ;

// DELETE statement
deleteStmt
    : DELETE FROM Identifier whereClause? SEMI
    ;

// IF statement
ifStmt
    : IF expression THEN statementList (ELSIF expression THEN statementList)* (ELSE statementList)? END IF SEMI
    ;

// CASE statement
caseStmt
    : CASE expression? whenClauseList (ELSE statementList)? END CASE SEMI
    ;

whenClauseList
    : whenClause+
    ;

whenClause
    : WHEN expression THEN statementList
    ;

// LOOP statement
loopStmt
    : label? LOOP statementList END LOOP label? SEMI
    ;

// WHILE statement
whileStmt
    : label? WHILE expression LOOP statementList END LOOP label? SEMI
    ;

// FOR statement
forStmt
    : label? FOR Identifier IN REVERSE? expression DOT DOT expression (BY expression)? LOOP statementList END LOOP label? SEMI
    | label? FOR Identifier IN selectStmt LOOP statementList END LOOP label? SEMI
    ;

// FOREACH statement
foreachStmt
    : label? FOREACH Identifier (SLICE IntegerLiteral)? IN ARRAY expression LOOP statementList END LOOP label? SEMI
    ;

// EXIT statement
exitStmt
    : EXIT Identifier? (WHEN expression)? SEMI
    ;

// CONTINUE statement
continueStmt
    : CONTINUE Identifier? (WHEN expression)? SEMI
    ;

// RETURN statement
returnStmt
    : RETURN expression? SEMI
    ;

// RAISE statement
raiseStmt
    : RAISE (NOTICE | WARNING | INFO | DEBUG | LOG | EXCEPTION)? (StringLiteral (COMMA expressionList)? | Identifier)? (USING raiseOptionList)? SEMI
    ;

raiseOptionList
    : raiseOption (COMMA raiseOption)*
    ;

raiseOption
    : (MESSAGE | DETAIL | HINT | ERRCODE | SQLSTATE) EQ expression
    ;

// ASSERT statement
assertStmt
    : ASSERT expression (COMMA expression)? SEMI
    ;

// NULL statement
nullStmt
    : NULL SEMI
    ;

// Nested block
nestedBlock
    : label? DECLARE? declarationList? BEGIN statementList exceptionSection? END label? SEMI
    ;

// Exception section
exceptionSection
    : EXCEPTION exceptionHandlerList
    ;

exceptionHandlerList
    : exceptionHandler+
    ;

exceptionHandler
    : WHEN exceptionConditionList THEN statementList
    ;

exceptionConditionList
    : exceptionCondition (OR exceptionCondition)*
    ;

exceptionCondition
    : Identifier
    | SQLSTATE StringLiteral
    ;

// GET DIAGNOSTICS
getDiagnosticsStmt
    : GET (CURRENT | STACKED)? DIAGNOSTICS diagnosticsItemList SEMI
    ;

diagnosticsItemList
    : diagnosticsItem (COMMA diagnosticsItem)*
    ;

diagnosticsItem
    : variableRef EQ diagnosticsOption
    ;

diagnosticsOption
    : Identifier  // ROW_COUNT, RESULT_OID, etc.
    ;

// Cursor operations
openCursorStmt
    : OPEN variableRef (LPAREN expressionList RPAREN)? (FOR selectStmt)? SEMI
    ;

closeCursorStmt
    : CLOSE variableRef SEMI
    ;

fetchStmt
    : FETCH variableRef INTO variableList SEMI
    ;

// SELECT statement (simplified)
selectStmt
    : SELECT selectList fromClause? whereClause?
    ;

// Parameter list
parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : Identifier dataType
    ;

// Expression (simplified for PL/pgSQL)
expression
    : literal
    | variableRef
    | functionCall
    | LPAREN expression RPAREN
    | expression (STAR | SLASH | PERCENT) expression
    | expression (PLUS | MINUS) expression
    | expression CONCAT expression
    | expression (EQ | NEQ | LT | LTE | GT | GTE) expression
    | expression (AND | OR) expression
    | NOT expression
    | expression IS (NOT)? NULL
    | CASE expression? whenExprClauseList (ELSE expression)? END
    | arrayExpression
    ;

whenExprClauseList
    : whenExprClause+
    ;

whenExprClause
    : WHEN expression THEN expression
    ;

arrayExpression
    : ARRAY LBRACK expressionList RBRACK
    | variableRef LBRACK expression RBRACK
    ;

functionCall
    : Identifier LPAREN (expressionList | STAR)? RPAREN
    ;

literal
    : IntegerLiteral
    | NumericLiteral
    | StringLiteral
    | NULL
    | TRUE
    | FALSE
    ;