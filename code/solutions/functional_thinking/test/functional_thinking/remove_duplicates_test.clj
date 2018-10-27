(ns functional-thinking.remove-duplicates-test
  (:require [clojure.test :refer :all]))

; write a function to remove consecutive duplicates
; from a sequence

; hint: (doc partition-by)
;       (doc identity)

(defn remove-consec-duplicates
  [x]
  (map first (partition-by identity x)))

(deftest remove-duplicates-test
  ; make the tests pass
  (is (= (apply str (remove-consec-duplicates "Cllllllllojjjure"))
         "Clojure"))
  (is (= (remove-consec-duplicates [1 1 2 3 3 2 2 3])
         '(1 2 3 2 3)))
  (is (= (remove-consec-duplicates [[1 2] [1 2] [3 4] [1 2]])
         '([1 2] [3 4] [1 2]))))

