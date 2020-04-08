#!/bin/bash

# cat data/movies.edn | ./070-find-by-name.sh "Back to the Future"

CODE='
(let [pattern (re-pattern (str ".*" (first *command-line-args*) ".*"))]
  (->> *input*
       (filter #(re-matches pattern (:title %)))))
'

bb -IO "$CODE" "$@"
