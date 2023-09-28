
grammar MatrixValidation;

start returns [int check]:
    m=matrix EOF { $check = $m.check; }
;

matrix returns [int check, int col, int width]:
    r1=row h=hashtag m1=matrix {$col = $r1.first_col + $m1.col;
                                $width = $m1.width;
                                $check = ($r1.sum == $col && $r1.width == $m1.width) ? 1 : 0;}
    | r1=row h=hashtag {$check = 0;$col = $row.first_col; $width = $row.width;}
    | row {$check = 1;$col = $row.first_col; $width = $row.width;}
;

row returns [int sum, int first_col, int width]:
    d1=digit r1=row {$sum = $r1.sum + $d1.value; $first_col = $d1.value; $width = 1 + $r1.width;}
    | digit {$sum = $digit.value; $first_col = $digit.value; $width = 1;}
;

digit returns [int value]:
    '0' { $value = 0; }
    | '1' { $value = 1; }
    | '2' { $value = 2; }
    | '3' { $value = 3; }
    | '4' { $value = 4; }
    | '5' { $value = 5; }
    | '6' { $value = 6; }
    | '7' { $value = 7; }
    | '8' { $value = 8; }
    | '9' { $value = 9; }
;

hashtag: '#';

WS: [ \t\r\n]+ -> skip;