(ns io.dominic.test2bencode
  (:require [neovim-client.0.api :as nvim.api]
            [neovim-client.nvim :as nvim]
            [clojure.tools.nrepl :as repl])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& [socket]]
  (println "Hello, World!")
  (let [client (nvim/new 0 "localhost" 7777)]
    (nvim.api/call-function client "Foo"
                            [(with-open [conn (repl/connect :port 38517)]
                               (-> (repl/client conn 1000)
                                   (repl/message {:op "eval" :code "(+ 2 3)"})
                                   repl/response-values))])
    (System/exit 0)))
