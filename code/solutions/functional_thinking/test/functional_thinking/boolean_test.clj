(ns functional-thinking.boolean-test
  (:require [clojure.test :refer :all]))


(deftest boolean-test
  ; make the following tests pass
  (is (= 1 (if-not false 1 0)))
  (is (= 1 (if-not nil 1 0)))
  (is (= 1 (if true 1 0)))
  (is (= 1 (if [] 1 0)))
  (is (= 1 (if [0] 1 0)))
  (is (= 1 (if 0 1 0)))
  (is (= 1 (if 1 1 0))))





