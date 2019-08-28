(ns functional-thinking.index-of-any
  (:require [clojure.test :refer :all]))


(defn index-of-any
  [s l]
  __)

(is (= [[0 \z]]
       (index-of-any "zzabyycdxx"
                     [\z \a])))

(is (= [[3 \b]]
       (index-of-any "zzabyycdxx"
                     [\b \y])))

(is (= ()
       (index-of-any "aba"
                     [\z])))
