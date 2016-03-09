(defproject clj-http "2.2.0-SNAPSHOT"
  :description "A Clojure HTTP library wrapping the Apache HttpComponents client."
  :url "https://github.com/dakrone/clj-http/"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/mit-license.php"
            :distribution :repo}
  :global-vars {*warn-on-reflection* false}
  :min-lein-version "2.0.0"
  :exclusions [org.clojure/clojure]
  :dependencies [[org.apache.httpcomponents/httpcore "4.4.4"]
                 [org.apache.httpcomponents/httpclient "4.5.1"]
                 [org.apache.httpcomponents/httpmime "4.5.1"]
                 [commons-codec "1.10"]
                 [commons-io "2.4"]
                 [slingshot "0.12.2"]
                 [potemkin "0.4.3"]]
  :profiles {:dev {:dependencies [;; optional deps
                                  [cheshire "5.5.0"]
                                  [crouton "0.1.2"]
                                  [org.clojure/tools.reader "0.10.0"]
                                  [com.cognitect/transit-clj "0.8.285"]
                                  [ring/ring-codec "1.0.0"]
                                  ;; other (testing) deps
                                  [org.clojure/clojure "1.8.0"]
                                  [org.clojure/tools.logging "0.3.1"]
                                  [log4j "1.2.17"]
                                  [ring/ring-jetty-adapter "1.4.0"]
                                  [ring/ring-devel "1.4.0"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}}
  :aliases {"all" ["with-profile" "dev,1.6:dev,1.7:dev"]}
  :plugins [[codox "0.6.4"]]
  :test-selectors {:default  #(not (:integration %))
                   :integration :integration
                   :all (constantly true)})
