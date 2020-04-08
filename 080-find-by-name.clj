#!/bin/sh

#_(
   "exec" "bb" "-IO" "$0" "$@"
   )

;; cat data/movies.edn | ./080-find-by-name.clj "Back to the Future"

(let [pattern (re-pattern (str ".*" (first *command-line-args*) ".*"))]
  (->> user/*input*
       (filter #(re-matches pattern (:title %)))))
