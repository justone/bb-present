

    Separate out code

        export BABASHKA_PRELOADS='(defn foo [x] (+ x 2))'
        bb '(foo 4)'

    Use '-f'

        bb -f code.clj

    Add classpath

        bb -cp $(clojure -Spath) -m foo.main
