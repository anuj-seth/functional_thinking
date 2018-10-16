(ns functional-thinking.consecutive-duplicates-test
  (:require [clojure.test :refer :all]))

; pack consecutive duplicates into sub lists
; hint: (doc partition-by)
; hint hint: (doc identity)
                                        
(deftest consecutive-duplicates-test
  ; make the below test cases pass
  (is (= (partition-by identity [1 1 2 1 1 1 3 3])
         '((1 1) (2) (1 1 1) (3 3))))
  (is (= (partition-by identity [:a :a :b :b :c])
         '((:a :a) (:b :b) (:c))))
  (is (= (partition-by identity [[1 2] [1 2] [3 4]])
         '(([1 2] [1 2]) ([3 4])))))

