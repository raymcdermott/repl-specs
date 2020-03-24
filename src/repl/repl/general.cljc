(ns repl.repl.general
  (:require [clojure.spec.alpha :as spec]))

(spec/def ::string-data (spec/and string? #(seq %)))
