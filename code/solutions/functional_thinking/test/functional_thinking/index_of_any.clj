(ns functional-thinking-neal-ford.chapter-1)

(defn word-frequencies
  [words]
  (let [non-words #{"the" "and" "of" "to" "a" "i"
                    "it" "in" "or" "is" "as" "so"
                    "but" "be"}
        word-seq (re-seq #"\w+" words)
        only-words (remove non-words
                           (map clojure.string/lower-case
                                word-seq))
        reduce-fn (fn [acc k]
                    (update acc
                            k
                            (fnil inc 0)))]
    (reduce reduce-fn
            {}
            only-words)))

(word-frequencies "the quick brown fox jumps over the lazy dogs")

(word-frequencies "Takes a function f, and returns a function that calls f, replacing
a nil first argument to f with the supplied value x. Higher arity
versions can replace arguments in the second and third
positions (y, z). Note that the function f can take any number of
arguments, not just the one(s) being nil-patched.")


(defn index-of-all
  [s l]
  (let [filter-fn (fn [[idx c]]
                    ((set l) c))]
    (filter filter-fn
            (map-indexed #(vector %1 %2)
                         s))))

(defn index-of-any
  [s l]
  (take 1
        (index-of-all s
                      l)))

(= [[0 \z]]
   (index-of-any "zzabyycdxx"
                 [\z \a]))

(= [[3 \b]]
   (index-of-any "zzabyycdxx"
                 [\b \y]))

(= ()
   (index-of-any "aba"
                 [\z]))
