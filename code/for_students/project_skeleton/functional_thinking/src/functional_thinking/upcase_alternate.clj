(ns functional-thinking.upcase-alternate
  (:require [clojure.test :refer :all]))

;; given a string convert the characters at
;; odd indices to upper case.
;; some functions that may help you
;; clojure.string/upper-case
;; clojure.string/join

(defn upcase-alternate
  [s]
  __)

(is (= "aBc"
       (upcase-alternate "abc")))

(is (= "aBcDeF"
       (upcase-alternate "abcdef")))


(is (= "a"
       (upcase-alternate "a")))
