

    Babashka one-liners

    Addition:

        bb '(+ 1 2)'

    First 100 squares:

        bb '(take 100 (map #(* % %) (range)))'

    D100 roll:

        bb '(rand-int 100)'
        bb '(take 10 (repeatedly #(rand-int 100)))'
