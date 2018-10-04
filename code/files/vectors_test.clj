(ns functional-thinking.vectors-test
  (:require [clojure.test :refer :all]))


(deftest vectors-test
  ; make the following tests pass
  (is (= [__]
         (list :a :b :c)
         (vec '(:a :b :c))
         (vector :a :b :c)))
  (is (= __ (conj [2 3 4] 1)))
  (is (= __ (conj [1 2] 3 4)))
  (is (= [__]
         '(__)
         (cons 1 [2 3 4]))))

