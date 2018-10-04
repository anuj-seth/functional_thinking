(ns functional-thinking.lists-test
  (:require [clojure.test :refer :all]))


(deftest lists-test
  ; make the following tests pass
  (is (= (list :a :b :c) '(:a :b :c)))
  (is (= '(1 2 3 4) (conj '(2 3 4) 1)))
  (is (= '(1 2 3 4) (conj '(3 4) 2 1))))
