(defproject io.dominic.test2bencode "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [neovim-client "0.1.1"]
                 [org.clojure/tools.nrepl "0.2.12"]]
  :profiles {:uberjar {:aot [neovim-client.0.api
                             neovim-client.nvim

                             io.dominic.test2bencode

                             clojure.core.async
                             clojure.core.async.impl.protocols
                             clojure.core.async.impl.channels
                             clojure.core.async.impl.dispatch
                             clojure.core.async.impl.exec.threadpool
                             clojure.core.async.impl.concurrent
                             clojure.core.async.impl.mutex
                             clojure.core.async.impl.buffers
                             clojure.core.async.impl.timers
                             clojure.core.async.impl.ioc-macros

                             ;; clojure.tools.analyzer
                             ;; clojure.tools.analyzer.utils
                             ;; clojure.tools.analyzer.env
                             ;; clojure.tools.analyzer.ast
                             ;; clojure.tools.analyzer.passes
                             ;; clojure.tools.analyzer.passes.jvm.annotate-loops
                             ;; clojure.tools.analyzer.passes.jvm.warn-on-reflection
                             ;; clojure.tools.analyzer.passes.jvm.validate-loop-locals
                             ;; clojure.tools.analyzer.jvm.utils

                             clojure.core.memoize
                             clojure.core.cache

                             clojure.data.priority-map

                             ;; clojure.tools.analyzer.passes.jvm.validate
                             ;; clojure.tools.analyzer.passes.cleanup
                             ;; clojure.tools.analyzer.passes.jvm.validate-recur
                             ;; clojure.tools.analyzer.passes.jvm.infer-tag
                             ;; clojure.tools.analyzer.passes.trim
                             ;; clojure.tools.analyzer.passes.elide-meta
                             ;; clojure.tools.analyzer.passes.source-info
                             ;; clojure.tools.analyzer.passes.jvm.annotate-tag
                             ;; clojure.tools.analyzer.passes.jvm.constant-lifter
                             ;; clojure.tools.analyzer.passes.constant-lifter
                             ;; clojure.tools.analyzer.passes.jvm.analyze-host-expr
                             ;; #"clojure\.tools\.analyzer\.passes.*"
                             ;; #"clojure.tools.analyzer.passes.*"


                             clojure.tools.analyzer
                             clojure.tools.analyzer.ast
                             clojure.tools.analyzer.ast.query
                             clojure.tools.analyzer.env
                             clojure.tools.analyzer.passes
                             clojure.tools.analyzer.passes.add-binding-atom
                             clojure.tools.analyzer.passes.cleanup
                             clojure.tools.analyzer.passes.collect-closed-overs
                             clojure.tools.analyzer.passes.constant-lifter
                             clojure.tools.analyzer.passes.elide-meta
                             clojure.tools.analyzer.passes.emit-form
                             clojure.tools.analyzer.passes.index-vector-nodes
                             clojure.tools.analyzer.passes.source-info
                             clojure.tools.analyzer.passes.trim
                             clojure.tools.analyzer.passes.uniquify
                             clojure.tools.analyzer.passes.warn-earmuff
                             clojure.tools.analyzer.utils


                             clojure.tools.analyzer.jvm
                             clojure.tools.analyzer.jvm.utils
                             clojure.tools.analyzer.passes.jvm.analyze-host-expr
                             clojure.tools.analyzer.passes.jvm.annotate-branch
                             clojure.tools.analyzer.passes.jvm.annotate-host-info
                             clojure.tools.analyzer.passes.jvm.annotate-loops
                             clojure.tools.analyzer.passes.jvm.annotate-tag
                             clojure.tools.analyzer.passes.jvm.box
                             clojure.tools.analyzer.passes.jvm.classify-invoke
                             clojure.tools.analyzer.passes.jvm.constant-lifter
                             clojure.tools.analyzer.passes.jvm.emit-form
                             clojure.tools.analyzer.passes.jvm.fix-case-test
                             clojure.tools.analyzer.passes.jvm.infer-tag
                             clojure.tools.analyzer.passes.jvm.validate
                             clojure.tools.analyzer.passes.jvm.validate-loop-locals
                             clojure.tools.analyzer.passes.jvm.validate-recur
                             clojure.tools.analyzer.passes.jvm.warn-on-reflection

                             clojure.tools.reader
                             clojure.tools.reader.default-data-readers
                             clojure.tools.reader.edn
                             clojure.tools.reader.impl.commons
                             clojure.tools.reader.impl.utils
                             clojure.tools.reader.reader-types

                             clojure.tools.logging
                             clojure.tools.logging.impl

                             neovim-client.message
                             neovim-client.parser
                             neovim-client.rpc

                             msgpack.clojure-extensions
                             msgpack.core
                             msgpack.macros

                             ]

                       ;; #"(clojure\.tools\.analyzer.*|clojure\.core\.(memoize|cache)|clojure.data.priority-map|neovim-client.*|io.dominic.test2bencode)"

                       ; For 1.9.0-alpha17, use this for the :aot value
                       ;:aot [zprint.core zprint.main clojure.core.specs.alpha],
                       :main io.dominic.test2bencode
                       :omit-source true}}

  ;; :uberjar-exclusions [#"\.(clj|java|cljs)"]
  :target-path "target/%s")
