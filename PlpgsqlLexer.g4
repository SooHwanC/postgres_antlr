lexer grammar PlpgsqlLexer;

options {
    caseInsensitive = true;
}

// PL/pgSQL Block Structure Keywords
DECLARE: 'DECLARE';
BEGIN: 'BEGIN';
END: 'END';
EXCEPTION: 'EXCEPTION';

// Control Flow
IF: 'IF';
THEN: 'THEN';
ELSIF: 'ELSIF';
ELSE: 'ELSE';
CASE: 'CASE';
WHEN: 'WHEN';
LOOP: 'LOOP';
WHILE: 'WHILE';
FOR: 'FOR';
FOREACH: 'FOREACH';
EXIT: 'EXIT';
CONTINUE: 'CONTINUE';
RETURN: 'RETURN';
RAISE: 'RAISE';

// SQL Commands
SELECT: 'SELECT';
INSERT: 'INSERT';
UPDATE: 'UPDATE';
DELETE: 'DELETE';
PERFORM: 'PERFORM';
EXECUTE: 'EXECUTE';
INTO: 'INTO';
FROM: 'FROM';
WHERE: 'WHERE';
SET: 'SET';
VALUES: 'VALUES';
RETURNING: 'RETURNING';
TO: 'TO';
DISTINCT: 'DISTINCT';
ALL: 'ALL';
GROUP: 'GROUP';
HAVING: 'HAVING';
ORDER: 'ORDER';
LIMIT: 'LIMIT';
OFFSET: 'OFFSET';
ASC: 'ASC';
DESC: 'DESC';
NULLS: 'NULLS';
FIRST: 'FIRST';
LAST: 'LAST';
WITH: 'WITH';

// Data Types
INTEGER: 'INTEGER' | 'INT';
BIGINT: 'BIGINT';
SMALLINT: 'SMALLINT';
NUMERIC: 'NUMERIC';
DECIMAL: 'DECIMAL';
REAL: 'REAL';
DOUBLE: 'DOUBLE' [ \t]+ 'PRECISION';
VARCHAR: 'VARCHAR';
CHAR: 'CHAR';
TEXT: 'TEXT';
BOOLEAN: 'BOOLEAN' | 'BOOL';
DATE: 'DATE';
TIMESTAMP: 'TIMESTAMP';
RECORD: 'RECORD';

// Loop Keywords
IN: 'IN';
REVERSE: 'REVERSE';
BY: 'BY';
ARRAY: 'ARRAY';
SLICE: 'SLICE';

// Exception Keywords
NOTICE: 'NOTICE';
WARNING: 'WARNING';
INFO: 'INFO';
DEBUG: 'DEBUG';
LOG: 'LOG';
SQLSTATE: 'SQLSTATE';
ERRCODE: 'ERRCODE';
MESSAGE: 'MESSAGE';
DETAIL: 'DETAIL';
HINT: 'HINT';

// Diagnostics
GET: 'GET';
DIAGNOSTICS: 'DIAGNOSTICS';
STACKED: 'STACKED';
CURRENT: 'CURRENT';

// Others
AS: 'AS';
IS: 'IS';
NULL: 'NULL';
NOT: 'NOT';
AND: 'AND';
OR: 'OR';
CONSTANT: 'CONSTANT';
DEFAULT: 'DEFAULT';
USING: 'USING';
STRICT: 'STRICT';
VOLATILE: 'VOLATILE';
STABLE: 'STABLE';
IMMUTABLE: 'IMMUTABLE';
LANGUAGE: 'LANGUAGE';
RETURNS: 'RETURNS';
CALLED: 'CALLED';
SECURITY: 'SECURITY';
DEFINER: 'DEFINER';
INVOKER: 'INVOKER';
ASSERT: 'ASSERT';
OPEN: 'OPEN';
CLOSE: 'CLOSE';
FETCH: 'FETCH';
MOVE: 'MOVE';
FOUND: 'FOUND';
CURSOR: 'CURSOR';

// Boolean literals
TRUE: 'TRUE';
FALSE: 'FALSE';

// Percentage modifiers for variable types
PERCENT: '%';
TYPE: 'TYPE';
ROWTYPE: 'ROWTYPE';

// Dollar for parameters
DOLLAR: '$';

// Operators
ASSIGN: ':=';
CONCAT: '||';
EQ: '=';
NEQ: '<>' | '!=';
LT: '<';
LTE: '<=';
GT: '>';
GTE: '>=';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
PERCENT_OP: '%';
CARET: '^';

// Delimiters
SEMI: ';';
COMMA: ',';
DOT: '.';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';

// Label
LABEL_START: '<<';
LABEL_END: '>>';

// Literals
IntegerLiteral: [0-9]+;
NumericLiteral: [0-9]+ '.' [0-9]+ | '.' [0-9]+;

StringLiteral: '\'' ( '\'\'' | ~['\r\n\\] | '\\' . )* '\'';

// Identifiers
Identifier: [a-zA-Z_] [a-zA-Z0-9_$]*;

QuotedIdentifier: '"' ( '""' | ~["\r\n] )* '"';

// Comments
LineComment: '--' ~[\r\n]* -> channel(HIDDEN);
BlockComment: '/*' .*? '*/' -> channel(HIDDEN);

// Whitespace
WS: [ \t\r\n]+ -> channel(HIDDEN);