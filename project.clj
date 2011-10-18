(defproject cljvaadin "1.0.0-SNAPSHOT"
  :description "Sample Vaadin web application using Clojure"
  :dependencies [[org.clojure/clojure "1.2.1"]
		 [com.vaadin/vaadin "6.6.2"]
                 [jetty/jetty "5.1.10"]]
  :dev-dependencies [[uk.org.alienscience/leiningen-war "0.0.2"]
                     [org.mortbay.jetty/jetty-runner "7.0.1.v20091125"]]
  :aot [cljvaadin.VaadinServlet])
