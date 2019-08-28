(ns functional-thinking.index-of-any)

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
