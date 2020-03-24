(ns repl.repl.user
  (:require
    [clojure.spec.alpha :as spec]
    [repl.repl.general :as general]))

;; Server defined user ID per WS connection, used for WS server push
(spec/def ::uid ::general/string-data)

;; Name entered by the user, will be unique per team
(spec/def ::name ::general/string-data)

(spec/def ::user (spec/keys :req [::name ::uid]))





