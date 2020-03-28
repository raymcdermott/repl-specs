(ns repl.repl.factory
  (:require
    [repl.repl.team-names :as team-names]))

(defn team-name
  []
  (team-names/gen-name))
