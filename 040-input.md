

    Babashka inputs and outputs

        -i : `*input*` is a lazy sequence of strings from stdin
        -I : `*input*` is a lazy sequence of parsed EDN from stdin

        -o : result of calculation will be printed, one entry per line
        -O : result of calculation will be printed as EDN, one entry per line

    Filename lengths:

        ls | bb -i '(map (juxt identity count) *input*)'
        ls | bb -i -o '(map (juxt identity count) *input*)'
        ls | bb -i -O '(map (juxt identity count) *input*)'
