(ns functional-thinking.vectors-test
  (:require [clojure.test :refer :all]))


(deftest vectors-test
  ; make the following tests pass
  (is (= [:a :b :c]
         (list :a :b :c)
         (vec '(:a :b :c))
         (vector :a :b :c)))
  (is (= [2 3 4 1] (conj [2 3 4] 1)))
  (is (= [1 2 3 4] (conj [1 2] 3 4)))
  (is (= [1 2 3 4] 
         '(1 2 3 4) 
         (cons 1 [2 3 4]))))


