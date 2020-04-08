

    Replace JQ *

    Single document:

        cat data/bttf.json | jq '.cast | length'

        cat data/bttf.json | jet --from json --to edn --keywordize > data/bttf.edn
        cat data/bttf.edn | bb -I '(-> *input* first :cast count)'

    Multiple documents:

        cat data/movies.edn | bb -IO '(filter #(re-matches #"Back to the Future.*" (:title %)) *input*)'
        cat data/movies.edn | bb -I --stream '(when (re-matches #"Back to the Future.*" (:title *input*)) *input*)'

    * with a little help from jet: https://github.com/borkdude/jet
