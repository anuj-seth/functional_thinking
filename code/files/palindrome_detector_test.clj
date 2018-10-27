(ns functional-thinking.palindrome-detector-test
  (:require [clojure.test :refer :all]))

; write a palindrome detector function which
; returns true if the sequence is a palindrome

(defn palindrome?
  [x]
  __)

(deftest palindrome-detector-test
  ; make the tests pass
  (is (false? (palindrome? '(1 2 3 4 5))))
  (is (true? (palindrome? [:foo :bar :foo])))
  (is (true? (palindrome? '(1 1 3 3 1 1))))
  (is (false? (palindrome? '(:a :b :c))))
  (is (true? (palindrome? "racecar")))
  ; note that a "racecar" does not equal '(\r \a \c \e \c \a \r)
  )

