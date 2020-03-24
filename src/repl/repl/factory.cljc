(ns repl.repl.factory
  (:require
    [repl.repl.general :as general]
    [repl.repl.team-names :as team-names]
    [repl.repl.user :as user]))

(defn team-name
  []
  (team-names/gen-name))
