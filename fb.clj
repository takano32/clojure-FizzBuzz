; Fizz Buzz in Clojure

(defn divisible [x n]
  (if (= 0 (mod x n))
    :true))


