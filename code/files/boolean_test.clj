(ns functional-thinking.boolean-test
  (:require [clojure.test :refer :all]))

(deftest boolean-test
  ; make the following tests pass
  (is (= __ (if-not false 1 0)))
  (is (= __ (if-not nil 1 0)))
  (is (= __ (if true 1 0)))
  (is (= __ (if [] 1 0)))
  (is (= __ (if [0] 1 0)))
  (is (= __ (if 0 1 0)))
  (is (= __ (if 1 1 0))))


