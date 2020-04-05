(ns repl.repl.user-test
  (:require
    [clojure.test :refer [deftest testing is]]
    [repl.repl.user :as user]))

(deftest user-tests
  (testing "user factory and find methods"
    (let [username "test-name-x"
          user-uid "test-uid-123"
          user (user/->user username user-uid)
          users (user/user->users user)]
      (is (= user (user/find-user username users)))
      (is (= user (user/get-user-by-uid user-uid users)))
      (is (= [user-uid] (user/get-uids users)))
      (is (= (user/->user "x" "x0")
             (user/find-user
               "x"
               (user/+user users (user/->user "x" "x0")))))
      (is (= users
             (user/other-users
               "x"
               (user/+user users (user/->user "x" "x0"))))))))
