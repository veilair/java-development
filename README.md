# Java Development
> Welcome to the world of Shell Development. An ongoing curated list of frameworks, books, articles, talks, screencasts, recordings, libraries, learning tutorials and resources about Shell Development. Thanks to all contributors, you're awesome and wouldn't be possible without you! Our goal is to build a categorized community-driven collection of very well-known resources.

## Table of Contents

- [Projects](#projects)
  - [Bean Mapping](#bean-mapping)
  - [Build](#build)
  - [Bytecode Manipulation](#bytecode-manipulation)
  - [Caching](#caching)
  - [CLI](#cli)
  - [Cluster Management](#cluster-management)
  - [Code Analysis](#code-analysis)
  - [Code Coverage](#code-coverage)
  - [Code Generators](#code-generators)
  - [Compiler-compiler](#compiler-compiler)
  - [Computer Vision](#computer-vision)
  - [Configuration](#configuration)
  - [Constraint Satisfaction Problem Solver](#constraint-satisfaction-problem-solver)
  - [CSV](#csv)
  - [Data Structures](#data-structures)
  - [Database](#database)
  - [Date and Time](#date-and-time)
  - [Dependency Injection](#dependency-injection)
  - [Development](#development)
  - [Distributed Applications](#distributed-applications)
  - [Distributed Transactions](#distributed-transactions)
  - [Distribution](#distribution)
  - [Document Processing](#document-processing)
  - [Financial](#financial)
  - [Formal Verification](#formal-verification)
  - [Functional Programming](#functional-programming)
  - [Game Development](#game-development)
  - [Geospatial](#geospatial)
  - [GUI](#gui)
  - [High Performance](#high-performance)
  - [HTTP Clients](#http-clients)
  - [Hypermedia Types](#hypermedia-types)
  - [IDE](#ide)
  - [Imagery](#imagery)
  - [Introspection](#introspection)
  - [Job Scheduling](#job-scheduling)
  - [JSON](#json)
  - [JVM and JDK](#jvm-and-jdk)
  - [Logging](#logging)
  - [Machine Learning](#machine-learning)
  - [Messaging](#messaging)
  - [Microservice](#microservice)
  - [Miscellaneous](#miscellaneous)
  - [Mobile Development](#mobile-development)
  - [Monitoring](#monitoring)
  - [Native](#native)
  - [Natural Language Processing](#natural-language-processing)
  - [Networking](#networking)
  - [ORM](#orm)
  - [PaaS](#paas)
  - [PDF](#pdf)
  - [Performance analysis](#performance-analysis)
  - [Platform](#platform)
  - [Processes](#processes)
  - [Reactive libraries](#reactive-libraries)
  - [REST Frameworks](#rest-frameworks)
  - [Science](#science)
  - [Search](#search)
  - [Security](#security)
  - [Serialization](#serialization)
  - [Server](#server)
  - [Template Engine](#template-engine)
  - [Testing](#testing)
  - [Utility](#utility)
  - [Version Managers](#version-managers)
  - [Web Crawling](#web-crawling)
  - [Web Frameworks](#web-frameworks)
  - [Workflow Orchestration Engines](#workflow-orchestration-engines)
- [Resources](#resources)
  - [Related Awesome Lists](#awesome-lists)
  - [Communities](#communities)
  - [Frontends](#frontends)
  - [Influential Books](#influential-books)
  - [Podcasts and Screencasts](#podcasts-and-screencasts)
  - [People](#people)
  - [Websites](#websites)
  - [Web links](#web-links)

## Projects

### Bean Mapping

_Frameworks that ease bean mapping._

- [dOOv](https://github.com/doov-io/doov) - Provides fluent API for typesafe domain model validation and mapping. It uses annotations, code generation and a type safe DSL to make bean validation and mapping fast and easy.
- [JMapper](https://github.com/jmapper-framework/jmapper-core) - Uses byte code manipulation for lightning-fast mapping. Supports annotations and API or XML configuration.
- [MapStruct](https://github.com/mapstruct/mapstruct) - Code generator that simplifies mappings between different bean types, based on a convention-over-configuration approach.
- [ModelMapper](https://github.com/modelmapper/modelmapper) - Intelligent object mapping library that automatically maps objects to each other.
- [Orika](https://github.com/orika-mapper/orika) - JavaBean-mapping framework that recursively copies (among other capabilities) data from one object to another.
- [reMap](https://github.com/remondis-it/remap) - Lambda and method handle-based mapping which requires code and not annotations if objects have different names.
- [Selma](https://github.com/xebia-france/selma) - Annotation processor-based bean mapper.

### Build

_Tools that handle the build cycle and dependencies of an application._

- [Apache Maven](https://maven.apache.org) - Declarative build and dependency management that favors convention over configuration. It might be preferable to Apache Ant, which uses a rather procedural approach and can be difficult to maintain.
- [Bazel](https://bazel.build) - Tool from Google that builds code quickly and reliably.
- [Buck](https://github.com/facebook/buck) - Encourages the creation of small, reusable modules consisting of code and resources.
- [Gradle](https://gradle.org) - Incremental builds programmed via Groovy instead of declaring XML. Works well with Maven's dependency management.

### Bytecode Manipulation

_Libraries to manipulate bytecode programmatically._

- [ASM](https://asm.ow2.io) - All-purpose, low-level bytecode manipulation and analysis.
- [Byte Buddy](https://bytebuddy.net) - Further simplifies bytecode generation with a fluent API.
- [bytecode-viewer](https://github.com/Konloch/bytecode-viewer) - Java 8 Jar & Android APK reverse engineering suite. (GPL-3.0-only)
- [Byteman](https://byteman.jboss.org) - Manipulate bytecode at runtime via DSL (rules); mainly for testing/troubleshooting. (LGPL-2.1-or-later)
- [cglib](https://github.com/cglib/cglib) - Bytecode generation library.
- [Javassist](https://github.com/jboss-javassist/javassist) - Tries to simplify bytecode editing.
- [Mixin](https://github.com/SpongePowered/Mixin) - Manipulate bytecode at runtime using real Java code.
- [Perses](https://github.com/nicolasmanic/perses) - Dynamically injects failure/latency at the bytecode level according to principles of chaos engineering.

### Caching

_Libraries that provide caching facilities._

- [cache2k](https://cache2k.org) - In-memory high performance caching library.
- [Caffeine](https://github.com/ben-manes/caffeine) - High-performance, near-optimal caching library.
- [Ehcache](http://www.ehcache.org) - Distributed general-purpose cache.
- [Infinispan](https://infinispan.org) - Highly concurrent key/value datastore used for caching.

### CLI

_Libraries for everything related to the CLI._

- [ASCII Table](https://github.com/vdmeer/asciitable) - Library to draw tables in ASCII.
- [Airline](https://github.com/airlift/airline) - Annotation-based framework for parsing Git-like command-line arguments.
- [args4j](http://args4j.kohsuke.org) - Small library to parse command-line arguments.
- [Jansi](https://github.com/fusesource/jansi) - ANSI escape codes to format console output.
- [Java ASCII Render](https://github.com/indvd00m/java-ascii-render) - Graphical primitives for the console.
- [JCommander](http://jcommander.org) - Command-line argument-parsing framework with custom types and validation via implementing interfaces.
- [jbock](https://github.com/jbock-java/jbock) - Reflectionless command line parser.
- [Jexer](https://gitlab.com/klamonte/jexer) - Advanced console (and Swing) text user interface (TUI) library, with mouse-draggable windows, built-in terminal window manager, and sixel image support. Looks like [Turbo Vision](https://en.wikipedia.org/wiki/Turbo_Vision).
- [JLine](https://github.com/jline/jline3) - Includes features from modern shells like completion or history.
- [JOpt Simple](https://jopt-simple.github.io/jopt-simple/) - Fluent parser that uses the POSIX#getopt and GNU#getopt_long syntaxes.
- [picocli](https://picocli.info) - ANSI colors and styles in usage help with annotation-based POSIX/GNU/any syntax, subcommands, strong typing for both options and positional args.
- [Text-IO](https://github.com/beryx/text-io) - Aids the creation of full console-based applications.
- [Lanterna](https://github.com/mabe02/lanterna) - Easy console text-GUI library, similar to curses. (LGPL-3.0-only)

### Cluster Management

_Frameworks that can dynamically manage applications inside of a cluster._

- [Apache Aurora](https://aurora.apache.org) - Mesos framework for long-running services and cron jobs.
- [Singularity](http://getsingularity.com) - Mesos framework that makes deployment and operations easy. It supports web services, background workers, scheduled jobs, and one-off tasks.

### Code Analysis

_Tools that provide metrics and quality measurements._

- [Checkstyle](https://github.com/checkstyle/checkstyle) - Static analysis of coding conventions and standards. (LGPL-2.1-or-later)
- [Error Prone](https://github.com/google/error-prone) - Catches common programming mistakes as compile-time errors.
- [Infer](https://github.com/facebook/infer) - Modern static analysis tool for verifying the correctness of code.
- [jQAssistant](https://jqassistant.org) - Static code analysis with Neo4J-based query language. (GPL-3.0-only)
- [NullAway](https://github.com/uber/NullAway) - Eliminates NullPointerExceptions with low build-time overhead.
- [PMD](https://github.com/pmd/pmd) - Source code analysis for finding bad coding practices.
- [SonarJava](https://github.com/SonarSource/sonar-java) - Static analyzer for SonarQube & SonarLint. (LGPL-3.0-only)
- [Sourcetrail](https://www.sourcetrail.com) - Visual source code navigator.
- [Spoon](https://github.com/INRIA/spoon) - Library for analyzing and transforming Java source code.
- [Spotbugs](https://github.com/spotbugs/spotbugs) - Static analysis of bytecode to find potential bugs. (LGPL-2.1-only)

### Code Coverage

_Frameworks and tools that enable code coverage metrics collection for test suites._

- [Clover](https://www.atlassian.com/software/clover) - Relies on source-code instrumentation instead of bytecode instrumentation.
- [Cobertura](https://cobertura.github.io/cobertura/) - Relies on offline (or static) bytecode instrumentation and class loading to collect code coverage metrics. (GPL-2.0-only)
- [JaCoCo](https://www.eclemma.org/jacoco/) - Framework that enables collection of code coverage metrics, using both offline and runtime bytecode instrumentation.

### Code Generators

_Tools that generate patterns for repetitive code in order to reduce verbosity and error-proneness._

- [ADT4J](https://github.com/sviperll/adt4j) - JSR-269 code generator for algebraic data types.
- [Auto](https://github.com/google/auto) - Generates factory, service, and value classes.
- [Bootify ![c]](https://bootify.io) - Browser-based Spring Boot app generation with JPA model and REST API.
- [FreeBuilder](https://github.com/inferred/FreeBuilder) - Automatically generates the Builder pattern.
- [Geci](https://github.com/verhas/javageci) - Discovers files that need generated code, updates automatically and writes to the source with a convenient API. 
- [Immutables](https://immutables.github.io) - Annotation processors to generate simple, safe and consistent value objects.
- [JavaPoet](https://github.com/square/javapoet) - API to generate source files.
- [JHipster](https://github.com/jhipster/generator-jhipster) - Yeoman source code generator for Spring Boot and AngularJS.
- [Joda-Beans](https://www.joda.org/joda-beans/) - Small framework that adds queryable properties to Java, enhancing JavaBeans.
- [Lombok](https://projectlombok.org) - Code generator that aims to reduce verbosity.
- [Record-Builder](https://github.com/Randgalt/record-builder) - Companion builder class, withers and templates for Java records.
- [Telosys](https://www.telosys.org/) - Simple and light code generator available as an Eclipse Plugin and also as a CLI.

### Compiler-compiler

_Frameworks that help to create parsers, interpreters or compilers._

- [ANTLR](https://www.antlr.org) - Complex full-featured framework for top-down parsing.
- [JavaCC](https://javacc.github.io/javacc/) - Parser generator that generates top-down parsers. Allows lexical state switching and permits extended BNF specifications.
- [JFlex](https://jflex.de) - Lexical analyzer generator.

### Computer Vision

_Libraries which seek to gain high level information from images and videos._

- [BoofCV](https://boofcv.org) - Library for image processing, camera calibration, tracking, SFM, MVS, 3D vision, QR Code and much more.
- [ImageJ](https://imagej.net/ImageJ) - Medical image processing application with an API.
- [JavaCV](https://github.com/bytedeco/javacv) - Java interface to OpenCV, FFmpeg, and much more.

### Configuration

_Libraries that provide external configuration._

- [centraldogma](https://github.com/line/centraldogma) - Highly-available version-controlled service configuration repository based on Git, ZooKeeper and HTTP/2.
- [cfg4j](https://github.com/cfg4j/cfg4j) - Modern configuration library for distributed apps written in Java.
- [config](https://github.com/lightbend/config) - Configuration library supporting Java properties, JSON or its human optimized superset HOCON.
- [Configurate](https://github.com/SpongePowered/Configurate) - Configuration library with support for various configuration formats and transformations.
- [dotenv](https://github.com/shyiko/dotenv) - Twelve-factor configuration library which uses environment-specific files.
- [ini4j](http://ini4j.sourceforge.net) - Provides an API for handling Windows' INI files.
- [KAConf](https://github.com/mariomac/kaconf) - Annotation-based configuration system for Java and Kotlin.
- [microconfig](https://microconfig.io) - Configuration system designed for microservices which helps to separate configuration from code. The configuration for different services can have common and specific parts and can be dynamically distributed.
- [owner](https://github.com/lviggiano/owner) - Reduces boilerplate of properties.

### Constraint Satisfaction Problem Solver

_Libraries that help with implementing optimization and satisfiability problems._

- [Choco](https://choco-solver.org) - Off-the-shelf constraint satisfaction problem solver that uses constraint programming techniques.
- [JaCoP](https://github.com/radsz/jacop) - Includes an interface for the FlatZinc language, enabling it to execute MiniZinc models. (AGPL-3.0)
- [OptaPlanner](https://www.optaplanner.org) - Business planning and resource scheduling optimization solver.

### CSV

_Frameworks and libraries that simplify reading/writing CSV data._

- [FastCSV](https://github.com/osiegmar/FastCSV) - Performance-optimized, dependency-free and RFC 4180 compliant.
- [jackson-dataformat-csv](https://github.com/FasterXML/jackson-dataformat-csv) - Jackson extension for reading and writing CSV.
- [opencsv](http://opencsv.sourceforge.net) - Simple CSV parser.
- [Super CSV](https://super-csv.github.io/super-csv/) - Powerful CSV parser with support for Dozer, Joda-Time and Java 8.
- [uniVocity-parsers](https://github.com/uniVocity/univocity-parsers) - One of the fastest and most feature-complete parsers. Also comes with parsers for TSV and fixed-width records.

### Data Structures

_Efficient and specific data structures._

- [Apache Avro](https://avro.apache.org) - Data interchange format with dynamic typing, untagged data, and absence of manually assigned IDs.
- [Apache Orc](https://orc.apache.org) - Fast and efficient columnar storage format for Hadoop-based workloads.
- [Apache Parquet](https://parquet.apache.org) - Columnar storage format based on assembly algorithms from Google's paper on Dremel.
- [Apache Thrift](https://thrift.apache.org) - Data interchange format that originated at Facebook.
- [Big Queue](https://github.com/bulldog2011/bigqueue) - Fast and persistent queue based on memory-mapped files.
- [HyperMinHash-java](https://github.com/LiveRamp/HyperMinHash-java) - Probabilistic data structure for computing union, intersection, and set cardinality in loglog space.
- [Persistent Collection](https://github.com/hrldcpr/pcollections) - Persistent and immutable analogue of the Java Collections Framework.
- [Protobuf](https://github.com/protocolbuffers/protobuf) - Google's data interchange format.
- [RoaringBitmap](https://github.com/RoaringBitmap/RoaringBitmap) - Fast and efficient compressed bitmap.
- [SBE](https://github.com/real-logic/simple-binary-encoding) - Simple Binary Encoding, one of the fastest message formats around.
- [Tape](https://github.com/square/tape) - Lightning-fast, transactional, file-based FIFO.
- [Wire](https://github.com/square/wire) - Clean, lightweight protocol buffers.

### Database

_Everything that simplifies interactions with the database._

- [Apache Calcite](https://calcite.apache.org) - Dynamic data management framework. It contains many of the pieces that comprise a typical database management system.
- [Apache Drill](https://drill.apache.org) - Distributed, schema on-the-fly, ANSI SQL query engine for Big Data exploration.
- [Apache Phoenix](https://phoenix.apache.org) - High-performance relational database layer over HBase for low-latency applications.
- [ArangoDB](https://github.com/arangodb/arangodb-java-driver) - ArangoDB Java driver.
- [Chronicle Map](https://github.com/OpenHFT/Chronicle-Map) - Efficient, in-memory (opt. persisted to disk), off-heap key-value store.
- [Debezium](https://debezium.io/) - Low latency data streaming platform for change data capture.
- [druid](https://druid.apache.org) - High-performance, column-oriented, distributed data store.
- [eXist](https://github.com/eXist-db/exist) - NoSQL document database and application platform. (LGPL-2.1-only)
- [FlexyPool](https://github.com/vladmihalcea/flexy-pool) - Brings metrics and failover strategies to the most common connection pooling solutions.
- [Flyway](https://flywaydb.org) - Simple database migration tool.
- [H2](https://h2database.com) - Small SQL database notable for its in-memory functionality.
- [HikariCP](https://github.com/brettwooldridge/HikariCP) - High-performance JDBC connection pool.
- [JDBI](http://jdbi.org) - Convenient abstraction of JDBC.
- [Jedis](https://github.com/xetorthio/jedis) - Small client for interaction with Redis, with methods for commands.
- [Jest](https://github.com/searchbox-io/Jest) - Client for the Elasticsearch REST API.
- [jetcd](https://github.com/justinsb/jetcd) - Client library for etcd.
- [Jinq](https://github.com/my2iu/Jinq) - Typesafe database queries via symbolic execution of Java 8 Lambdas (on top of JPA or jOOQ).
- [jOOQ](https://www.jooq.org) - Generates typesafe code based on SQL schema.
- [Leaf](https://github.com/Meituan-Dianping/Leaf) - Distributed ID generate service.
- [Liquibase](http://www.liquibase.org) - Database-independent library for tracking, managing and applying database schema changes.
- [MapDB](http://www.mapdb.org) - Embedded database engine that provides concurrent collections backed on disk or in off-heap memory.
- [MariaDB4j](https://github.com/vorburger/MariaDB4j) - Launcher for MariaDB that requires no installation or external dependencies.
- [Modality](https://github.com/arkanovicz/modality) - Lightweight ORM with database reverse engineering features.
- [Spring Data JPA MongoDB Expressions](https://github.com/mhewedy/spring-data-jpa-mongodb-expressions) - Allows you to use MongoDB query language to query your relational database.
- [Trino](https://trino.io) - Distributed SQL query engine for big data.
- [QueryStream](https://github.com/querystream/querystream) - Build JPA Criteria queries using a Stream-like API.
- [Querydsl](http://www.querydsl.com) - Typesafe unified queries.
- [Realm](https://github.com/realm/realm-java) - Mobile database to run directly inside phones, tablets or wearables.
- [Redisson](https://github.com/redisson/redisson) - Allows for distributed and scalable data structures on top of a Redis server.
- [requery](https://github.com/requery/requery) - Modern, lightweight but powerful object mapping and SQL generator. Easily map to or create databases, or perform queries and updates from any Java-using platform.
- [Speedment](https://github.com/speedment/speedment) - Database access library that utilizes Java 8's Stream API for querying.
- [Vibur DBCP](https://www.vibur.org) - JDBC connection pool library with advanced performance monitoring capabilities.
- [Xodus](https://github.com/JetBrains/xodus) - Highly concurrent transactional schema-less and ACID-compliant embedded database.

### Date and Time

_Libraries related to handling date and time._

- [Almanac Converter](https://github.com/chrisengelsma/almanac-converter) - Simple conversion between different calendar systems.
- [iCal4j](https://github.com/ical4j/ical4j) - Parse and build iCalendar [RFC 5545](https://tools.ietf.org/html/rfc5545) data models.
- [ThreeTen-Extra](https://github.com/ThreeTen/threeten-extra) - Additional date-time classes that complement those in JDK 8.
- [Time4J](https://github.com/MenoData/Time4J) - Advanced date and time library. (LGPL-2.1-only)

### Dependency Injection

_Libraries that help to realize the [Inversion of Control](https://en.wikipedia.org/wiki/Inversion_of_control) paradigm._

- [Apache DeltaSpike](https://deltaspike.apache.org) - CDI extension framework.
- [Dagger](https://dagger.dev/) - Compile-time injection framework without reflection.
- [Feather](https://github.com/zsoltherpai/feather) - Ultra-lightweight, JSR-330-compliant dependency injection library.
- [Governator](https://github.com/Netflix/governator) - Extensions and utilities that enhance Google Guice.
- [Guice](https://github.com/google/guice) - Lightweight and opinionated framework that completes Dagger.
- [HK2](https://javaee.github.io/hk2/) - Lightweight and dynamic dependency injection framework.
- [JayWire](https://github.com/vanillasource/jaywire) - Lightweight dependency injection framework. (LGPL-3.0-only)

### Development

_Augmentation of the development process at a fundamental level._

- [AspectJ](https://www.eclipse.org/aspectj/) - Seamless aspect-oriented programming extension.
- [DCEVM](https://dcevm.github.io) - JVM modification that allows unlimited redefinition of loaded classes at runtime. (GPL-2.0-only)
- [Faux Pas](https://github.com/zalando/faux-pas) - Library that simplifies error handling by circumventing the issue that none of the functional interfaces in the Java Runtime is allowed by default to throw checked exceptions.
- [HotswapAgent](https://github.com/HotswapProjects/HotswapAgent) - Unlimited runtime class and resource redefinition. (GPL-2.0-only)
- [JavaParser](https://github.com/javaparser/javaparser) - Parse, modify and generate Java code.
- [JavaSymbolSolver](https://github.com/javaparser/javasymbolsolver) - Symbol solver.
- [Manifold](https://github.com/manifold-systems/manifold) - Re-energizes Java with powerful features like type-safe metaprogramming, structural typing and extension methods.
- [NoException](https://noexception.machinezoo.com) - Allows checked exceptions in functional interfaces and converts exceptions to Optional return.
- [SneakyThrow](https://github.com/rainerhahnekamp/sneakythrow) - Ignores checked exceptions without bytecode manipulation. Can also be used inside Java 8 stream operations.
- [Tail](https://kag0.github.io/tail) - Enable infinite recursion using tail call optimization.

### Distributed Applications

_Libraries and frameworks for writing distributed and fault-tolerant applications._

- [Apache Geode](https://geode.apache.org) - In-memory data management system that provides reliable asynchronous event notifications and guaranteed message delivery.
- [Apache Storm](https://storm.apache.org) - Realtime computation system.
- [Apache ZooKeeper](https://zookeeper.apache.org) - Coordination service with distributed configuration, synchronization, and naming registry for large distributed systems.
- [Atomix](https://atomix.io) - Fault-tolerant distributed coordination framework.
- [Axon](https://axoniq.io) - Framework for creating CQRS applications.
- [Dropwizard Circuit Breaker](https://github.com/mtakaki/dropwizard-circuitbreaker) - Circuit breaker design pattern for Dropwizard. (GPL-2.0-only)
- [Failsafe](https://github.com/jhalterman/failsafe) - Simple failure handling with retries and circuit breakers.
- [Hazelcast](https://github.com/hazelcast/hazelcast) - Highly scalable in-memory datagrid with a free open-source version.
- [JGroups](http://www.jgroups.org) - Toolkit for reliable messaging and cluster creation.
- [Quasar](http://docs.paralleluniverse.co/quasar/) - Lightweight threads and actors for the JVM.
- [resilience4j](https://github.com/resilience4j/resilience4j) - Functional fault tolerance library.
- [ScaleCube Services](https://github.com/scalecube/scalecube-services) - Embeddable Cluster-Membership library based on SWIM and gossip protocol.
- [Zuul](https://github.com/Netflix/zuul) - Gateway service that provides dynamic routing, monitoring, resiliency, security, and more.

### Distributed Transactions

_Distributed transactions provide a mechanism for ensuring consistency of data updates in the presence of concurrent access and partial failures._

- [Atomikos](https://www.atomikos.com) - Provides transactions for REST, SOA and microservices with support for JTA and XA.
- [Bitronix](https://github.com/bitronix/btm) - Simple but complete implementation of the JTA 1.1 API.
- [Narayana](https://narayana.io) - Provides support for traditional ACID and compensation transactions, also complies with JTA, JTS and other standards. (LGPL-2.1-only)
- [Seata](https://github.com/seata/seata) - Delivers high performance and easy to use distributed transaction services under a microservices architecture.

### Distribution

_Tools that handle the distribution of applications in native formats._

- [Artipie](https://github.com/artipie/artipie) - Binary artifact management toolkit which hosts them on the file system or S3.
- [Boxfuse ![c]](https://boxfuse.com) - Deployment of JVM applications to AWS using the principles of immutable infrastructure.
- [Capsule](https://github.com/puniverse/capsule) - Simple and powerful packaging and deployment. A fat JAR on steroids, or a "Docker for Java" that supports JVM-optimized containers.
- [Central Repository](https://search.maven.org) - Largest binary component repository available as a free service to the open-source community. Default used by Apache Maven, and available in all other build tools.
- [Cloudsmith ![c]](https://cloudsmith.io) - Fully managed package management SaaS with support for Maven/Gradle/SBT with a free tier.
- [Getdown](https://github.com/threerings/getdown) - A system for deploying Java applications to end-user computers and keeping them up to date. Developed as an alternative to Java Web Start.
- [IzPack](http://izpack.org) - Setup authoring tool for cross-platform deployments.
- [JavaPackager](https://github.com/fvarrui/JavaPackager) - Maven and Gradle plugin which provides an easy way to package Java applications in native Windows, Mac OS X or GNU/Linux executables, and generate installers for them.
- [jlink.online](https://github.com/cilki/jlink.online) - Builds optimized runtimes over HTTP.
- [Nexus ![c]](https://www.sonatype.com) - Binary management with proxy and caching capabilities.
- [packr](https://github.com/libgdx/packr) - Packs JARs, assets and the JVM for native distribution on Windows, Linux and macOS.
- [really-executable-jars-maven-plugin](https://github.com/brianm/really-executable-jars-maven-plugin) - Maven plugin for making self-executing JARs.

### Document Processing

_Libraries that assist with processing office document formats._

- [Apache POI](https://poi.apache.org) - Supports OOXML (XLSX, DOCX, PPTX) as well as OLE2 (XLS, DOC or PPT).
- [documents4j](https://documents4j.com/#/) - API for document format conversion using third-party converters such as MS Word.
- [docx4j](https://www.docx4java.org/trac/docx4j) - Create and manipulate Microsoft Open XML files.
- [fastexcel](https://github.com/dhatim/fastexcel) - High performance library to read and write large Excel (XLSX) worksheets.
- [zerocell](https://github.com/creditdatamw/zerocell) - Annotation-based API for reading data from Excel sheets into POJOs with focus on reduced overhead.

### Financial

_Libraries related to the financial domain._

- [Cassandre](https://github.com/cassandre-tech/cassandre-trading-bot) - Trading bot framework.
- [Parity](https://github.com/paritytrading/parity) - Platform for trading venues.
- [Philadelphia](https://github.com/paritytrading/philadelphia) - Low-latency financial information exchange.
- [Square](https://github.com/square/connect-java-sdk) - Integration with the Square API.
- [Stripe](https://github.com/stripe/stripe-java) - Integration with the Stripe API.
- [ta4j](https://github.com/ta4j/ta4j) - Library for technical analysis.

### Formal Verification

_Formal-methods tools: proof assistants, model checking, symbolic execution, etc._

- [CATG](https://github.com/ksen007/janala2) - Concolic unit testing engine. Automatically generates unit tests using formal methods.
- [Checker Framework](https://checkerframework.org) - Pluggable type systems. Includes nullness types, physical units, immutability types and more. (GPL-2.0-only WITH Classpath-exception-2.0)
- [Daikon](https://plse.cs.washington.edu/daikon/) - Detects likely program invariants and generates JML specs based on those invariants.
- [Java Path Finder (JPF)](https://github.com/javapathfinder/jpf-core) - JVM formal verification tool containing a model checker and more. Created by NASA.
- [JMLOK 2.0](https://massoni.computacao.ufcg.edu.br/home/jmlok) - Detects inconsistencies between code and JML specification through feedback-directed random tests generation, and suggests a likely cause for each nonconformance detected. (GPL-3.0-only)
- [KeY](https://www.key-project.org) - Formal software development tool that aims to integrate design, implementation, formal specification, and formal verification of object-oriented software as seamlessly as possible. Uses JML for specification and symbolic execution for verification. (GPL-2.0-or-later)
- [OpenJML](http://www.openjml.org) - Translates JML specifications into SMT-LIB format and passes the proof problems implied by the program to backend solvers. (GPL-2.0-only)

### Functional Programming

_Libraries that facilitate functional programming._

- [Cyclops](https://github.com/aol/cyclops) - Monad and stream utilities, comprehensions, pattern matching, functional extensions for all JDK collections, future streams, trampolines and much more.
- [derive4j](https://github.com/derive4j/derive4j) - Java 8 annotation processor and framework for deriving algebraic data types constructors, pattern-matching and morphisms. (GPL-3.0-only)
- [Fugue](https://bitbucket.org/atlassian/fugue) - Functional extensions to Guava.
- [Functional Java](http://www.functionaljava.org) - Implements numerous basic and advanced programming abstractions that assist composition-oriented development.
- [jOOλ](https://github.com/jOOQ/jOOL) - Extension to Java 8 that aims to fix gaps in lambda by providing numerous missing types and a rich set of sequential Stream API additions.
- [protonpack](https://github.com/poetix/protonpack) - Collection of stream utilities.
- [StreamEx](https://github.com/amaembo/streamex) - Enhances Java 8 Streams.
- [Vavr](https://www.vavr.io) - Functional component library that provides persistent data types and functional control structures.

### Game Development

_Frameworks that support the development of games._

- [FXGL](https://almasb.github.io/FXGL/) - JavaFX Game Development Framework.
- [JBox2D](http://www.jbox2d.org/) - Port of the renowned C++ 2D physics engine.
- [jMonkeyEngine](https://jmonkeyengine.org) - Game engine for modern 3D development.
- [libGDX](https://libgdx.com) - All-round cross-platform, high-level framework.
- [Litiengine](https://litiengine.com/) - AWT-based, lightweight 2D game engine.
- [LWJGL](https://www.lwjgl.org) - Robust framework that abstracts libraries like OpenGL/CL/AL.
- [Mini2Dx](https://mini2dx.org) - Beginner-friendly, master-ready framework for rapidly prototyping and building 2D games.

### Geospatial

_Libraries for working with geospatial data and algorithms._

- [Apache SIS](https://sis.apache.org) - Library for developing geospatial applications.
- [Geo](https://github.com/davidmoten/geo) - GeoHash utilities in Java.
- [GeoTools](https://geotools.org) - Library that provides tools for geospatial data. (LGPL-2.1-only)
- [GraphHopper](https://github.com/graphhopper/graphhopper) - Road-routing engine. Used as a Java library or standalone web service.
- [H2GIS](http://www.h2gis.org) - Spatial extension of the H2 database. (LGPL-3.0-only)
- [Jgeohash](https://astrapi69.github.io/jgeohash/) - Library for using the GeoHash algorithm.
- [Mapsforge](https://github.com/mapsforge/mapsforge) - Map rendering based on OpenStreetMap data. (LGPL-3.0-only)
- [Spatial4j](https://github.com/locationtech/spatial4j) - General-purpose spatial/geospatial library.

### GUI

_Libraries to create modern graphical user interfaces._

- [JavaFX](https://wiki.openjdk.java.net/display/OpenJFX/Main) - Successor of Swing.
- [Scene Builder](https://gluonhq.com/products/scene-builder/) - Visual layout tool for JavaFX applications.
- [SWT](https://www.eclipse.org/swt/) - Graphical widget toolkit.

### High Performance

_Everything about high-performance computation, from collections to specific libraries._

- [Agrona](https://github.com/real-logic/Agrona) - Data structures and utility methods that are common in high-performance applications.
- [Disruptor](https://lmax-exchange.github.io/disruptor/) - Inter-thread messaging library.
- [Eclipse Collections](https://github.com/eclipse/eclipse-collections) - Collections framework inspired by Smalltalk.
- [fastutil](http://fastutil.di.unimi.it) - Fast and compact type-specific collections.
- [HPPC](https://labs.carrotsearch.com/hppc.html) - Primitive collections.
- [JCTools](https://github.com/JCTools/JCTools) - Concurrency tools currently missing from the JDK.
- [Koloboke](https://github.com/leventov/Koloboke) - Carefully designed extension of the Java Collections Framework with primitive specializations and more.

### HTTP Clients

_Libraries that assist with creating HTTP requests and/or binding responses._

- [Apache HttpComponents](https://hc.apache.org/) - A toolset of low level Java components focused on HTTP and associated protocols.
- [Async Http Client](https://github.com/AsyncHttpClient/async-http-client) - Asynchronous HTTP and WebSocket client library.
- [Feign](https://github.com/OpenFeign/feign) - HTTP client binder inspired by Retrofit, JAXRS-2.0, and WebSocket.
- [Google HTTP Client](https://github.com/googleapis/google-http-java-client) - Pluggable HTTP transport abstraction with support for java.net.HttpURLConnection, Apache HTTP Client, Android, Google App Engine, XML, Gson, Jackson and Protobuf.
- [methanol](https://github.com/mizosoft/methanol) - HTTP client extensions library.
- [restQL-java](https://github.com/b2wdigital/restQL-java) - Microservice query language that fetches information from multiple services.
- [Retrofit](https://square.github.io/retrofit/) - Typesafe REST client.
- [Ribbon](https://github.com/Netflix/ribbon) - Client-side IPC library that is battle-tested in cloud.
- [Riptide](https://github.com/zalando/riptide) - Client-side response routing for Spring's RestTemplate.
- [unirest-java](https://github.com/Kong/unirest-java) - Simplified, lightweight HTTP client library.

### Hypermedia Types

_Libraries that handle serialization to hypermedia types._

- [hate](https://github.com/blackdoor/hate) - Builds hypermedia-friendly objects according to HAL specification.
- [JSON-LD](https://github.com/jsonld-java/jsonld-java) - JSON-LD implementation.
- [Siren4J](https://github.com/eserating-chwy/siren4j) - Library for the Siren specification.

### IDE

_Integrated development environments that try to simplify several aspects of development._

- [Eclipse](https://www.eclipse.org) - Established open-source project with support for lots of plugins and languages.
- [IntelliJ IDEA ![c]](https://www.jetbrains.com/idea/) - Supports many JVM languages and provides good options for Android development. The commercial edition targets the enterprise sector.
- [jGRASP](https://www.jgrasp.org) - Created to provide software visualizations that work in conjunction with the debugger such as Control Structure Diagrams, UML class diagrams and Object Viewer.
- [NetBeans](https://netbeans.apache.org) - Provides integration for several Java SE and EE features, from database access to HTML5.
- [Recaf](https://www.coley.software/Recaf/) - Bytecode editor.
- [Visual Studio Code](https://code.visualstudio.com/docs/languages/java) - Provides Java support for lightweight projects with a simple, modern workflow by using extensions from the internal marketplace.

### Imagery

_Libraries that assist with the creation, evaluation or manipulation of graphical images._

- [Imgscalr](https://github.com/rkalla/imgscalr) - Simple, efficient and hardware-accelerated image-scaling library implemented in pure Java 2D.
- [Tess4J](https://github.com/nguyenq/tess4j) - JNA wrapper for Tesseract OCR API.
- [Thumbnailator](https://github.com/coobird/thumbnailator) - High-quality thumbnail generation library.
- [TwelveMonkeys](https://github.com/haraldk/TwelveMonkeys) - Collection of plugins that extend the number of supported image file formats.
- [ZXing](https://github.com/zxing/zxing) - Multi-format 1D/2D barcode image processing library.
- [image-comparison](https://github.com/romankh3/image-comparison) - Library that compares 2 images with the same sizes and shows the differences visually by drawing rectangles. Some parts of the image can be excluded from the comparison. Can be used for automation qa tests.

### Introspection

_Libraries that help make the Java introspection and reflection API easier and faster to use._

- [ClassGraph](https://github.com/classgraph/classgraph) - ClassGraph (formerly FastClasspathScanner) is an uber-fast, ultra-lightweight, parallelized classpath scanner and module scanner for Java, Scala, Kotlin and other JVM languages.
- [jOOR](https://github.com/jOOQ/jOOR) - jOOR stands for jOOR Object Oriented Reflection. It is a simple wrapper for the java.lang.reflect package.
- [Mirror](http://projetos.vidageek.net/mirror/mirror/) - Mirror was created to bring light to a simple problem, usually named ReflectionUtil, which is on almost all projects that rely on reflection to do advanced tasks.
- [Objenesis](http://objenesis.org) - Allows dynamic instantiation without default constructor, e.g. constructors which have required arguments, side effects or throw exceptions.
- [ReflectASM](https://github.com/EsotericSoftware/reflectasm) - ReflectASM is a very small Java library that provides high performance reflection by using code generation.
- [Reflections](https://github.com/ronmamo/reflections) - Reflections scans your classpath, indexes the metadata, allows you to query it on runtime and may save and collect that information for many modules within your project.

### Job Scheduling

_Libraries for scheduling background jobs._

- [JobRunr](https://github.com/jobrunr/jobrunr) - Job scheduling library which utilizes lambdas for fire-and-forget, delayed and recurring jobs. Guarantees execution by single scheduler instance using optimistic locking. Has features for persistence, minimal dependencies and is embeddable.
- [Quartz](https://github.com/quartz-scheduler/quartz) - Feature-rich, open source job scheduling library that can be integrated within virtually any Java application.
- [Sundial](https://github.com/knowm/Sundial) - Lightweight framework to simply define jobs, define triggers and start the scheduler.
- [Wisp](https://github.com/Coreoz/Wisp) - Simple library with minimal footprint and straightforward API.
- [db-scheduler](https://github.com/kagkarlsson/db-scheduler) - Persistent and cluster-friendly scheduler.
- [easy-batch](https://github.com/j-easy/easy-batch) - Set up batch jobs with simple processing pipelines. Records are read in sequence from a data source, processed in pipeline and written in batches to a data sink.
- [shedlock](https://github.com/lukas-krecan/ShedLock) - Makes sure that your scheduled tasks are executed at most once at the same time. If a task is being executed on one node, it acquires a lock which prevents execution of the same task from another node or thread.

### JSON

_Libraries for serializing and deserializing JSON to and from Java objects._

- [DSL-JSON](https://github.com/ngs-doo/dsl-json) - JSON library with advanced compile time databinding.
- [Genson](http://genson.io) - Powerful and easy-to-use Java-to-JSON conversion library.
- [Gson](https://github.com/google/gson) - Serializes objects to JSON and vice versa. Good performance with on-the-fly usage.
- [HikariJSON](https://github.com/brettwooldridge/HikariJSON) - High-performance JSON parser, 2x faster than Jackson.
- [jackson-modules-java8](https://github.com/FasterXML/jackson-modules-java8) - Set of Jackson modules for Java 8 datatypes and features.
- [Jackson-datatype-money](https://github.com/zalando/jackson-datatype-money) - Open-source Jackson module to support JSON serialization and deserialization of JavaMoney data types.
- [Jackson](https://github.com/FasterXML/jackson) - Similar to GSON, but offers performance gains if you need to instantiate the library more often.
- [JSON-io](https://github.com/jdereg/json-io) - Convert Java to JSON. Convert JSON to Java. Pretty print JSON. Java JSON serializer.
- [jsoniter](http://jsoniter.com) - Fast and flexible library with iterator and lazy parsing API.
- [LoganSquare](https://github.com/bluelinelabs/LoganSquare) - JSON parsing and serializing library based on Jackson's streaming API. Outperforms GSON & Jackson's library.
- [Moshi](https://github.com/square/moshi) - Modern JSON library, less opinionated and uses built-in types like List and Map.
- [Yasson](https://github.com/eclipse-ee4j/yasson) - Binding layer between classes and JSON documents similar to JAXB.
- [fastjson](https://github.com/alibaba/fastjson) - Very fast processor with no additional dependencies and full data binding.
- [Jolt](https://github.com/bazaarvoice/jolt) - JSON to JSON transformation tool.
- [JsonPath](https://github.com/json-path/JsonPath) - Extract data from JSON using XPATH-like syntax.
- [JsonSurfer](https://github.com/jsurfer/JsonSurfer) - Streaming JsonPath processor dedicated to processing big and complicated JSON data.

### JVM and JDK

_Current implementations of the JVM/JDK._

- [Adopt Open JDK](https://adoptopenjdk.net) - Community-driven OpenJDK builds, including both HotSpot and OpenJ9.
- [Avian](https://github.com/ReadyTalk/avian) - JVM with JIT, AOT modes and iOS port.
- [Corretto](https://aws.amazon.com/corretto/) - No-cost, multiplatform, production-ready distribution of OpenJDK by Amazon. (GPL-2.0-only WITH Classpath-exception-2.0)
- [Dragonwell8](https://github.com/alibaba/dragonwell8) - Downstream version of OpenJDK optimized for online e-commerce, financial, logistics applications.
- [Graal](https://github.com/oracle/graal) - Polyglot embeddable JVM. (GPL-2.0-only WITH Classpath-exception-2.0)
- [Liberica JDK](https://bell-sw.com) - Built from OpenJDK, thoroughly tested and passed the JCK. (GPL-2.0-only WITH Classpath-exception-2.0)
- [OpenJ9](https://github.com/eclipse/openj9) - High performance, enterprise-calibre, flexibly licensed, openly-governed cross-platform JVM extending and augmenting the runtime technology components from the Eclipse OMR and OpenJDK project.
- [Open JDK](https://openjdk.java.net) - Open JDK community home. (GPL-2.0-only WITH Classpath-exception-2.0)
- [ParparVM](https://github.com/codenameone/CodenameOne/tree/master/vm) - VM with non-blocking, concurrent GC for iOS. (GPL-2.0-only WITH Classpath-exception-2.0)
- [RedHat Open JDK](https://developers.redhat.com/products/openjdk/overview) - RedHat's OpenJDK distribution. (GPL-2.0-only WITH Classpath-exception-2.0)
- [SAP Machine](https://sap.github.io/SapMachine/) - SAP's no-cost, rigorously tested and JCK-verified OpenJDK friendly fork. (GPL-2.0-only WITH Classpath-exception-2.0)
- [Zulu](https://www.azul.com/products/zulu-community/) - OpenJDK builds for Windows, Linux, and macOS. (GPL-2.0-only WITH Classpath-exception-2.0)

### Logging

_Libraries that log the behavior of an application._

- [Apache Log4j 2](https://logging.apache.org/log4j/) - Complete rewrite with a powerful plugin and configuration architecture.
- [Graylog](https://www.graylog.org) - Open-source aggregator suited for extended role and permission management. (GPL-3.0-only)
- [Kibana](https://www.elastic.co/kibana) - Analyzes and visualizes log files. Some features require payment.
- [Logback](http://logback.qos.ch) - Robust logging library with interesting configuration options via Groovy.
- [Logbook](https://github.com/zalando/logbook) - Extensible, open-source library for HTTP request and response logging.
- [Logstash](https://www.elastic.co/logstash) - Tool for managing log files.
- [p6spy](https://github.com/p6spy/p6spy) - Enables logging for all JDBC transactions without changes to the code.
- [SLF4J](http://www.slf4j.org) - Abstraction layer/simple logging facade.
- [tinylog](https://tinylog.org/v2/) - Lightweight logging framework with static logger class.
- [OpenTracing Toolbox](https://github.com/zalando/opentracing-toolbox) - Collection of libraries that build on top of OpenTracing and provide extensions and plugins to existing instrumentations.

### Machine Learning

_Tools that provide specific statistical algorithms for learning from data._

- [Apache Flink](https://flink.apache.org) - Fast, reliable, large-scale data processing engine.
- [Apache Mahout](https://mahout.apache.org) - Scalable algorithms focused on collaborative filtering, clustering and classification.
- [DatumBox](http://www.datumbox.com) - Provides several algorithms and pre-trained models for natural language processing.
- [Deeplearning4j](https://deeplearning4j.org) - Distributed and multi-threaded deep learning library.
- [DJL](https://djl.ai) - High-level and engine-agnostic framework for deep learning.
- [H2O ![c]](https://www.h2o.ai) - Analytics engine for statistics over big data.
- [JSAT](https://github.com/EdwardRaff/JSAT) - Algorithms for pre-processing, classification, regression, and clustering with support for multi-threaded execution. (GPL-3.0-only)
- [m2cgen](https://github.com/BayesWitnesses/m2cgen) - CLI tool to transpile models into native code.
- [oj! Algorithms](https://www.ojalgo.org/) - High-performance mathematics, linear algebra and optimisation needed for data science, machine learning and scientific computing.
- [Oryx 2](https://github.com/OryxProject/oryx) - Framework for building real-time, large-scale machine learning applications. Includes end-to-end applications for collaborative filtering, classification, regression, and clustering.
- [Siddhi](https://github.com/siddhi-io/siddhi) - Cloud native streaming and complex event processing engine.
- [Smile](https://github.com/haifengl/smile) - Statistical Machine Intelligence and Learning Engine provides a set of machine learning algorithms and a visualization library.
- [Tribuo](https://tribuo.org/) - Provides tools for classification, regression, clustering, model development and interfaces with other libraries such as scikit-learn, pytorch and TensorFlow.
- [Weka](https://www.cs.waikato.ac.nz/ml/weka/) - Collection of algorithms for data mining tasks ranging from pre-processing to visualization. (GPL-3.0-only)

### Messaging

_Tools that help send messages between clients to ensure protocol independency._

- [Aeron](https://github.com/real-logic/Aeron) - Efficient, reliable, unicast and multicast message transport.
- [Apache ActiveMQ](https://activemq.apache.org) - Message broker that implements JMS and converts synchronous to asynchronous communication.
- [Apache Camel](https://camel.apache.org) - Glues together different transport APIs via Enterprise Integration Patterns.
- [Apache Kafka](https://kafka.apache.org) - High-throughput distributed messaging system.
- [Apache Pulsar](https://pulsar.apache.org) - Distributed pub/sub-messaging system.
- [Apache RocketMQ](https://rocketmq.apache.org) - Fast, reliable, and scalable distributed messaging platform.
- [Apache Qpid](https://qpid.apache.org) - Apache Qpid makes messaging tools that speak AMQP and support many languages and platforms.
- [EventBus](https://github.com/greenrobot/EventBus) - Simple publish/subscribe event bus.
- [Hermes](http://hermes.allegro.tech) - Fast and reliable message broker built on top of Kafka.
- [JeroMQ](https://github.com/zeromq/jeromq) - Implementation of ZeroMQ.
- [Nakadi](https://github.com/zalando/nakadi) - Provides a RESTful API on top of Kafka.
- [RabbitMQ Java client](https://github.com/rabbitmq/rabbitmq-java-client) - RabbitMQ client.
- [Smack](https://github.com/igniterealtime/Smack) - Cross-platform XMPP client library.
- [NATS client](https://github.com/nats-io/nats.java) - NATS client.

### Microservice

_Tools for creating and managing microservices._

- [ActiveRPC](https://rpc.activej.io) - Lightweight and fast library for complex high-load distributed applications and Memcached-like solutions.
- [Apollo](https://spotify.github.io/apollo/) - Libraries for writing composable microservices.
- [Armeria](https://github.com/line/armeria) - Asynchronous RPC/REST client/server library built on top of Java 8, Netty, HTTP/2, Thrift and gRPC.
- [consul-api](https://github.com/Ecwid/consul-api) - Client for the Consul API: a distributed, highly available and datacenter-aware registry/discovery service.
- [Eureka](https://github.com/Netflix/eureka) - REST-based service registry for resilient load balancing and failover.
- [Helidon](https://helidon.io) - Two-style approach for writing microservices: Functional-reactive and as an implementation of MicroProfile.
- [Micronaut](https://micronaut.io) - Modern full-stack framework with focus on modularity, minimal memory footprint and startup time.
- [Nacos](https://nacos.io) - Dynamic service discovery, configuration and service management platform for building cloud native applications.
- [Quarkus](https://quarkus.io) - Kubernetes stack tailored for the HotSpot and Graal VM.
- [Sentinel](https://github.com/alibaba/Sentinel) - Flow control component enabling reliability, resilience and monitoring for microservices.

### Miscellaneous

_Everything else._

- [CQEngine](https://github.com/npgall/cqengine) - Ultra-fast, SQL-like queries on Java collections.
- [Design Patterns](https://github.com/iluwatar/java-design-patterns) - Implementation and explanation of the most common design patterns.
- [FF4J](https://github.com/ff4j/ff4j) - Feature Flags for Java.
- [FizzBuzz Enterprise Edition](https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition) - No-nonsense implementation of FizzBuzz made by serious businessmen for serious business purposes. (No explicit license)
- [J2ObjC](https://github.com/google/j2objc) - Java-to-Objective-C translator for porting Android libraries to iOS.
- [JBake](https://jbake.org) - Static website generator.
- [JBot](https://github.com/rampatra/jbot) - Framework for building chatbots. (GPL-3.0-only)
- [JCuda](http://jcuda.org) - JCuda offers Java bindings for CUDA and CUDA-related libraries.
- [Jimfs](https://github.com/google/jimfs) - In-memory file system.
- [JObfuscator![c]](https://www.pelock.com/products/jobfuscator) - Source code obfuscator.
- [Joda-Money](https://www.joda.org/joda-money/) - Basic currency and money classes and algorithms not provided by the JDK.
- [JPad](http://jpad.io) - Snippet runner.
- [jsweet](https://github.com/cincheo/jsweet) - Source transpiler to TypeScript/JavaScript.
- [Maven Wrapper](https://github.com/takari/maven-wrapper) - Analogue of Gradle Wrapper for Maven, allows building projects without installing maven.
- [Membrane Service Proxy](https://github.com/membrane/service-proxy) - Open-source, reverse-proxy framework.
- [MinimalFTP](https://github.com/Guichaguri/MinimalFTP) - Lightweight, small and customizable FTP server.
- [Modern Java - A Guide to Java 8](https://github.com/winterbe/java8-tutorial) - Popular Java 8 guide.
- [Modernizer](https://github.com/gaul/modernizer-maven-plugin) - Detect uses of legacy Java APIs.
- [OctoLinker](https://github.com/OctoLinker/OctoLinker) - Browser extension which allows to navigate through code on GitHub more efficiently.
- [OpenRefine](http://openrefine.org) - Tool for working with messy data: cleaning, transforming, extending it with web services and linking it to databases.
- [PipelinR](https://github.com/sizovs/pipelinr) - Small utility library for using handlers and commands with pipelines.
- [Polyglot for Maven](https://github.com/takari/polyglot-maven) - Extensions for Maven 3.3.1+ that allows writing the POM model in dialects other than XML.
- [Simple Java Mail](https://github.com/bbottema/simple-java-mail) - Mailing with a clean and fluent API.
- [Smooks](https://github.com/smooks/smooks) - Framework for fragment-based message processing. (Apache-2.0 OR LGPL-3.0-or-later)
- [Togglz](https://www.togglz.org) - Implementation of the Feature Toggles pattern.
- [TypeTools](https://github.com/jhalterman/typetools) - Tools for resolving generic types.
- [XMLBeam](https://github.com/SvenEwald/xmlbeam) - Processes XML by using annotations or XPath within code.
- [yGuard](https://github.com/yWorks/yGuard) - Obfuscation via renaming and shrinking.

### Mobile Development

_Tools for creating or managing mobile applications._

- [Codename One](https://www.codenameone.com) - Cross-platform solution for writing native mobile apps. (GPL-2.0-only WITH Classpath-exception-2.0)
- [MobileUI](https://mobileui.dev) - Cross-platform framework for developing mobile apps with native UI in Java and Kotlin.
- [Multi-OS Engine](https://multi-os-engine.org) - Open-source, cross-platform engine to develop native mobile (iOS, Android, etc.) apps.

### Monitoring

_Tools that monitor applications in production._

- [Automon](https://github.com/stevensouza/automon) - Combines the power of AOP with monitoring and/or logging tools.
- [Failsafe Actuator](https://github.com/zalando/failsafe-actuator) - Out of the box monitoring of Failsafe Circuit Breaker in Spring-Boot environment.
- [Glowroot](https://glowroot.org) - Open-source Java APM.
- [inspectIT](https://www.inspectit.rocks) - Captures detailed run-time information via hooks that can be changed on the fly. It supports tracing over multiple systems via the OpenTracing API and can correlate the data with end user monitoring.
- [Instrumental ![c]](https://instrumentalapp.com) - Real-time Java application performance monitoring. A commercial service with free development accounts.
- [JavaMelody](https://github.com/javamelody/javamelody) - Performance monitoring and profiling.
- [Jaeger client](https://github.com/jaegertracing/jaeger-client-java) - Jaeger client.
- [jmxtrans](https://github.com/jmxtrans/jmxtrans) - Connect to multiple JVMs and query them for their attributes via JMX. Its query language is based on JSON, which allows non-Java programmers to access the JVM attributes. Supports different output writes, including Graphite, Ganglia, and StatsD.
- [Jolokia](https://jolokia.org) - JMX over REST.
- [Metrics](https://github.com/dropwizard/metrics) - Expose metrics via JMX or HTTP and send them to a database.
- [Datadog ![c]](https://github.com/DataDog/dd-trace-java) - Modern monitoring & analytics.
- [nudge4j](https://github.com/lorenzoongithub/nudge4j) - Remote developer console from the browser for Java 8 via bytecode injection.
- [Pinpoint](https://github.com/naver/pinpoint) - Open-source APM tool.
- [Prometheus](https://github.com/prometheus/client_java) - Provides a multi-dimensional data model, DSL, autonomous server nodes and much more.
- [Sentry ![c]](https://github.com/getsentry/sentry-java) - Integration with [Sentry](https://github.com/getsentry/sentry), an application error tracking and performance analysis platform.
- [SPM ![c]](https://github.com/sematext/sematext-agent-java) - Performance monitor with distributing transaction tracing for JVM apps.
- [Stagemonitor](https://github.com/stagemonitor/stagemonitor) - Open-source performance monitoring and transaction tracing for JVM apps.
- [Sysmon](https://github.com/palantir/Sysmon) - Lightweight platform monitoring tool for Java VMs.
- [zipkin](https://zipkin.io) - Distributed tracing system which gathers timing data needed to troubleshoot latency problems in microservice architectures.

### Native

_For working with platform-specific native libraries._

- [Aparapi](https://github.com/Syncleus/aparapi) - Converts bytecode to OpenCL which allows execution on GPUs.
- [JavaCPP](https://github.com/bytedeco/javacpp) - Provides efficient and easy access to native C++.
- [JNA](https://github.com/java-native-access/jna) - Work with native libraries without writing JNI. Also provides interfaces to common system libraries.
- [JNR](https://github.com/jnr/jnr-ffi) - Work with native libraries without writing JNI. Also provides interfaces to common system libraries. Same goals as JNA, but faster, and serves as the basis for the upcoming [Project Panama](http://openjdk.java.net/projects/panama).

### Natural Language Processing

_Libraries that specialize in processing text._

- [CogCompNLP](https://github.com/CogComp/cogcomp-nlp) - Provides common annotators for plain text input. (Research and Academic Use License)
- [CoreNLP](https://nlp.stanford.edu/software/corenlp.shtml) - Provides a set of fundamental tools for tasks like tagging, named entity recognition, and sentiment analysis. (GPL-3.0-or-later)
- [DKPro](https://dkpro.github.io) - Collection of reusable NLP tools for linguistic pre-processing, machine learning, lexical resources, etc.
- [LingPipe](http://alias-i.com/lingpipe/) - Toolkit for tasks ranging from POS tagging to sentiment analysis.

### Networking

_Libraries for building network servers._

- [Commons-networking](https://github.com/CiscoSE/commons-networking) - Client for server-sent events (SSE).
- [Comsat](https://github.com/puniverse/comsat) - Integrates standard Java web-related APIs with Quasar fibers and actors.
- [Dubbo](https://github.com/apache/dubbo) - High-performance RPC framework.
- [Grizzly](https://javaee.github.io/grizzly/) - NIO framework. Used as a network layer in Glassfish.
- [gRPC](https://github.com/grpc/grpc-java) - RPC framework based on protobuf and HTTP/2.
- [KryoNet](https://github.com/EsotericSoftware/kryonet) - Provides a clean and simple API for efficient TCP and UDP client/server network communication using NIO and Kryo.
- [MINA](https://mina.apache.org) - Abstract, event-driven async I/O API for network operations over TCP/IP and UDP/IP via Java NIO.
- [Netty](https://netty.io) - Framework for building high-performance network applications.
- [Drift](https://github.com/airlift/drift) - Easy-to-use, annotation-based library for creating Thrift clients and serializable types.
- [ServiceTalk](https://github.com/apple/servicetalk) - Framework built on Netty with APIs tailored to specific protocols and support for multiple programming paradigms.
- [sshj](https://github.com/hierynomus/sshj) - Programmatically use SSH, SCP or SFTP.
- [TLS Channel](https://github.com/marianobarrios/tls-channel) - Implements a ByteChannel interface over SSLEngine, enabling easy-to-use (socket-like) TLS.
- [Undertow](http://undertow.io) - Web server providing both blocking and non-blocking APIs based on NIO. Used as a network layer in WildFly. (LGPL-2.1-only)
- [urnlib](https://github.com/slub/urnlib) - Represent, parse and encode URNs, as in RFC 2141. (GPL-3.0-only)

### ORM

_APIs that handle the persistence of objects._

- [Apache Cayenne](https://cayenne.apache.org) - Provides a clean, static API for data access. Also includes a GUI Modeler for working with database mappings, and DB reverse engineering and generation.
- [Doma](https://github.com/domaframework/doma) - Database access framework that verifies and generates source code at compile time using annotation processing as well as native SQL templates called two-way SQL.
- [Ebean](https://ebean.io) - Provides simple and fast data access.
- [EclipseLink](https://www.eclipse.org/eclipselink/) - Supports a number of persistence standards: JPA, JAXB, JCA and SDO.
- [Hibernate](http://hibernate.org/orm/) - Robust and widely used, with an active community. (LGPL-2.1-only)
- [MyBatis](https://github.com/mybatis/mybatis-3) - Couples objects with stored procedures or SQL statements.
- [ObjectiveSql](https://github.com/braisdom/ObjectiveSql) - ActiveRecord ORM for rapid development and convention over configuration.
- [Permazen](https://github.com/permazen/permazen) - Language-natural persistence layer.
- [SimpleFlatMapper](https://github.com/arnaudroger/SimpleFlatMapper) - Simple database and CSV mapper.

### PaaS

_Java platform as a service._

- [AWS Elastic Beanstalk ![c]](https://aws.amazon.com/elasticbeanstalk/) - AWS-based, with support for Tomcat and Jetty.
- [AWS Lambda ![c]](https://aws.amazon.com/lambda/) - Serverless computation.
- [Google Cloud ![c]](https://cloud.google.com) - Google's cloud infrastructure.
- [Heroku ![c]](https://www.heroku.com) - Abstract computing environments.
- [Microsoft Azure ![c]](https://azure.microsoft.com/en-us/) - Microsoft's cloud infrastructure.
- [OpenShift ![c]](https://www.openshift.com) - Provides additionally an on-premise solution.

### PDF

_Tools to help with PDF files._

- [Apache FOP](https://xmlgraphics.apache.org/fop/) - Creates PDFs from XSL-FO.
- [Apache PDFBox](https://pdfbox.apache.org) - Toolbox for creating and manipulating PDFs.
- [Dynamic Jasper](http://dynamicjasper.com) - Abstraction layer to JasperReports. (LGPL-3.0-only)
- [DynamicReports](https://github.com/dynamicreports/dynamicreports) - Simplifies JasperReports. (LGPL-3.0-only)
- [Eclipse BIRT](https://www.eclipse.org/birt) - Report engine for creating PDF and other formats (DOCX, XLSX, HTML, etc) using Eclipse-based visual editor.
- [flyingsaucer](https://github.com/flyingsaucerproject/flyingsaucer) - XML/XHTML and CSS 2.1 renderer. (LGPL-2.1-or-later)
- [iText ![c]](https://itextpdf.com/en) - Creates PDF files programmatically.
- [JasperReports](https://community.jaspersoft.com/project/jasperreports-library) - Complex reporting engine. (LGPL-3.0-only)
- [Open HTML to PDF](https://github.com/danfickle/openhtmltopdf) - Properly supports modern PDF standards based on flyingsaucer and Apache PDFBox.
- [OpenPDF](https://github.com/LibrePDF/OpenPDF) - Open-source iText fork. (LGPL-3.0-only & MPL-2.0)
- [Tabula](https://github.com/tabulapdf/tabula-java) - Extracts tables from PDF files.

### Performance analysis

_Tools for performance analysis, profiling and benchmarking._

- [fastThread ![c]](https://fastthread.io) - Analyze and visualize thread dumps with a free cloud-based upload interface.
- [GCeasy ![c]](https://gceasy.io) - Tool to analyze and visualize GC logs. It provides a free cloud-based upload interface.
- [honest-profiler](https://github.com/jvm-profiling-tools/honest-profiler) - Low-overhead, bias-free sampling profiler.
- [jHiccup](https://github.com/giltene/jHiccup) - Logs and records platform JVM stalls.
- [JITWatch](https://github.com/AdoptOpenJDK/jitwatch) - Analyze the JIT compiler optimisations made by the HotSpot JVM.
- [JMH](http://openjdk.java.net/projects/code-tools/jmh/) - Harness for building, running, and analysing nano/micro/milli/macro benchmarks written in Java and other languages targeting the JVM. (GPL-2.0 only WITH Classpath-exception-2.0)
- [LatencyUtils](https://github.com/LatencyUtils/LatencyUtils) - Utilities for latency measurement and reporting.

### Platform

_Frameworks that are suites of multiple libraries encompassing several categories._

#### Apache Commons

- [BCEL](http://commons.apache.org/proper/commons-bcel/) - Byte Code Engineering Library - analyze, create, and manipulate Java class files.
- [BeanUtils](http://commons.apache.org/proper/commons-beanutils/) - Easy-to-use wrappers around the Java reflection and introspection APIs.
- [BeanUtils2](http://commons.apache.org/sandbox/commons-beanutils2/) - Redesign of Commons BeanUtils.
- [BSF](http://commons.apache.org/proper/commons-bsf/) - Bean Scripting Framework - interface to scripting languages, including JSR-223.
- [Chain](http://commons.apache.org/proper/commons-chain/) - Chain of Responsibility pattern implementation.
- [ClassScan](http://commons.apache.org/sandbox/commons-classscan/) - Find Class interfaces, methods, fields, and annotations without loading.
- [CLI](http://commons.apache.org/proper/commons-cli/) - Command-line arguments parser.
- [CLI2](http://commons.apache.org/sandbox/commons-cli2/) - Redesign of Commons CLI.
- [Codec](http://commons.apache.org/proper/commons-codec/) - General encoding/decoding algorithms, e.g. phonetic, base64 or URL.
- [Collections](http://commons.apache.org/proper/commons-collections/) - Extends or augments the Java Collections Framework.
- [Compress](http://commons.apache.org/proper/commons-compress/) - Defines an API for working with tar, zip and bzip2 files.
- [Configuration](http://commons.apache.org/proper/commons-configuration/) - Reading of configuration/preferences files in various formats.
- [Convert](http://commons.apache.org/sandbox/commons-convert/) - Commons-Convert aims to provide a single library dedicated to the task of converting an object of one type to another.
- [CSV](http://commons.apache.org/proper/commons-csv/) - Component for reading and writing comma separated value files.
- [Daemon](http://commons.apache.org/proper/commons-daemon/) - Alternative invocation mechanism for unix-daemon-like java code.
- [DBCP](http://commons.apache.org/proper/commons-dbcp/) - Database connection pooling services.
- [DbUtils](http://commons.apache.org/proper/commons-dbutils/) - JDBC helper library.
- [Digester](http://commons.apache.org/proper/commons-digester/) - XML-to-Java-object mapping utility.
- [Email](http://commons.apache.org/proper/commons-email/) - Library for sending e-mail from Java.
- [Exec](http://commons.apache.org/proper/commons-exec/) - API for dealing with external process execution and environment management in Java.
- [FileUpload](http://commons.apache.org/proper/commons-fileupload/) - File upload capability for your servlets and web applications.
- [Finder](http://commons.apache.org/sandbox/commons-finder/) - Java library inspired by the UNIX find command.
- [Flatfile](http://commons.apache.org/sandbox/commons-flatfile/) - Java library for working with flat data structures.
- [Functor](http://commons.apache.org/proper/commons-functor/) - Function that can be manipulated as an object, or an object representing a single, generic function.
- [Graph](http://commons.apache.org/sandbox/commons-graph/) - General purpose graph APIs and algorithms.
- [I18n](http://commons.apache.org/sandbox/commons-i18n/) - Adds the feature of localized message bundles that consist of one or many localized texts that belong together.
- [Id](http://commons.apache.org/sandbox/commons-id/) - Id is a component used to generate identifiers.
- [Imaging](http://commons.apache.org/proper/commons-imaging/) - Image library.
- [IO](http://commons.apache.org/proper/commons-io/) - Collection of I/O utilities.
- [Javaflow](http://commons.apache.org/sandbox/commons-javaflow/) - Continuation implementation to capture the state of the application.
- [JCI](http://commons.apache.org/proper/commons-jci/) - Java Compiler Interface.
- [JCS](http://commons.apache.org/proper/commons-jcs/) - Java Caching System.
- [Jelly](http://commons.apache.org/proper/commons-jelly/) - XML based scripting and processing engine.
- [Jexl](http://commons.apache.org/proper/commons-jexl/) - Expression language which extends the Expression Language of the JSTL.
- [JNet](http://commons.apache.org/sandbox/commons-jnet/) - JNet allows to use dynamically register url stream handlers through the java.net API.
- [JXPath](http://commons.apache.org/proper/commons-jxpath/) - Utilities for manipulating Java Beans using the XPath syntax.
- [Lang](http://commons.apache.org/proper/commons-lang/) - Provides extra functionality for classes in java.lang.
- [Logging](https://commons.apache.org/proper/commons-logging/) - Wrapper around a variety of logging API implementations.
- [Math](http://commons.apache.org/proper/commons-math/) - Lightweight, self-contained mathematics and statistics components.
- [Monitoring](http://commons.apache.org/sandbox/commons-monitoring/) - Monitoring aims to provide a simple but extensible monitoring solution for Java applications.
- [Nabla](http://commons.apache.org/sandbox/commons-nabla/) - Nabla provides automatic differentiation classes that can generate derivative of any function implemented in the Java language.
- [Net](http://commons.apache.org/proper/commons-net/) - Collection of network utilities and protocol implementations.
- [OGNL](http://commons.apache.org/proper/commons-ognl/) - Object-graph navigation language.
- [OpenPGP](http://commons.apache.org/sandbox/commons-openpgp/) - Interface to signing and verifying data using OpenPGP.
- [Performance](http://commons.apache.org/sandbox/commons-performance/) - Small framework for microbenchmark clients, with implementations for Commons DBCP and Pool.
- [Pipeline](http://commons.apache.org/sandbox/commons-pipeline/) - Provides a set of pipeline utilities designed around work queues that run in parallel to sequentially process data objects.
- [Pool](http://commons.apache.org/proper/commons-pool/) - Generic object pooling component.
- [Proxy](http://commons.apache.org/proper/commons-proxy/) - Library for creating dynamic proxies.
- [RDF](https://commons.apache.org/proper/commons-rdf/) - Common implementation of RDF 1.1 that could be implemented by systems on the JVM.
- [RNG](https://commons.apache.org/proper/commons-rng/) - Commons Rng provides implementations of pseudo-random numbers generators.
- [SCXML](http://commons.apache.org/proper/commons-scxml/) - Implementation of the State Chart XML specification aimed at creating and maintaining a Java SCXML engine.
- [Validator](http://commons.apache.org/proper/commons-validator/) - Framework to define validators and validation rules in an xml file.
- [VFS](http://commons.apache.org/proper/commons-vfs/) - Virtual File System component for treating files, FTP, SMB, ZIP and such like as a single logical file system.
- [Weaver](http://commons.apache.org/proper/commons-weaver/) - Provides an easy way to enhance (weave) compiled bytecode.

#### Other

- [CUBA Platform](https://www.cuba-platform.com/) - High-level framework for developing enterprise applications with a rich web interface, based on Spring, EclipseLink and Vaadin.
- [Light-4J](https://github.com/networknt/light-4j/) - Fast, lightweight and productive microservices framework with built-in [security](https://github.com/networknt/light-oauth2/).
- [Orienteer](https://github.com/OrienteerBAP/Orienteer/) - Open-source business application platform for rapid configuration/development of CRM, ERP, LMS and other applications.
- [Spring](https://spring.io/projects/) - Provides many packages for dependency injection, aspect-oriented programming, security, etc.

### Processes

_Libraries that help the management of operating system processes._

- [ch.vorburger.exec](https://github.com/vorburger/ch.vorburger.exec) - Convenient API around Apache Commons Exec.
- [zt-exec](https://github.com/zeroturnaround/zt-exec) - Provides a unified API to Apache Commons Exec and ProcessBuilder.
- [zt-process-killer](https://github.com/zeroturnaround/zt-process-killer) - Stops processes started from Java or the system processes via PID.

### Reactive libraries

_Libraries for developing reactive applications._

- [Akka](https://akka.io) - Toolkit and runtime for building concurrent, distributed, fault-tolerant and event-driven applications.
- [Reactive Streams](https://github.com/reactive-streams/reactive-streams-jvm) - Provides a standard for asynchronous stream processing with non-blocking backpressure.
- [Reactor](https://github.com/reactor/reactor-core) - Library for building reactive fast-data applications.
- [RxJava](https://github.com/ReactiveX/RxJava) - Allows for composing asynchronous and event-based programs using observable sequences.
- [vert.x](https://vertx.io) - Polyglot event-driven application framework.

### REST Frameworks

_Frameworks specifically for creating RESTful services._

- [Dropwizard](https://github.com/dropwizard/dropwizard) - Opinionated framework for setting up modern web applications with Jetty, Jackson, Jersey and Metrics.
- [Elide](https://elide.io) - Opinionated framework for JSON- or GraphQL-APIs based on a JPA data model.
- [Jersey](https://jersey.github.io) - JAX-RS reference implementation.
- [Microserver](https://github.com/aol/micro-server) - Convenient, extensible microservices plugin system for Spring & Spring Boot. With more than 30 plugins and growing, it supports both micro-monolith and pure microservices styles.
- [Rapidoid](https://www.rapidoid.org) - Simple, secure and extremely fast framework consisting of an embedded HTTP server, GUI components and dependency injection.
- [rest.li](https://github.com/linkedin/rest.li) - Framework for building robust, scalable RESTful architectures using typesafe bindings and asynchronous, non-blocking IO with an end-to-end developer workflow that promotes clean practices, uniform interface design and consistent data modeling.
- [RESTEasy](https://resteasy.github.io) - Fully certified and portable implementation of the JAX-RS specification.
- [RestExpress](https://github.com/RestExpress/RestExpress) - Thin wrapper on the JBoss Netty HTTP stack that provides scaling and performance.
- [Restlet Framework](https://github.com/restlet/restlet-framework-java) - Pioneering framework with powerful routing and filtering capabilities, and a unified client and server API.
- [Spark](http://sparkjava.com) - Sinatra inspired framework.
- [Crnk](http://www.crnk.io) - Implementation of the JSON API specification to build resource-oriented REST endpoints with sorting, filtering, paging, linking, object graphs, type-safety, bulk updates, integrations and more.
- [springdoc-openapi](https://github.com/springdoc/springdoc-openapi) - Automates the generation of API documentation using Spring Boot projects.
- [Swagger](https://swagger.io) - Standard, language-agnostic interface to REST APIs.

### Science

_Libraries for scientific computing, analysis and visualization._

- [BioJava](https://biojava.org/) - Facilitates processing biological data by providing algorithms, file format parsers, sequencing and 3D visualization commonly used in bioinformatics.
- [Chart-FX](https://github.com/GSI-CS-CO/chart-fx) - Scientific charting library with focus on performance optimised real-time data visualisation at 25 Hz update rates for large data sets.
- [DataMelt](https://jwork.org/dmelt/) - Environment for scientific computation, data analysis and data visualization. (GPL-3.0-or-later)
- [Erdos](https://github.com/Erdos-Graph-Framework/Erdos) - Modular, light and easy graph framework for theoretic algorithms.
- [GraphStream](http://graphstream-project.org) - Library for modeling and analyzing dynamic graphs.
- [JFreeChart](http://www.jfree.org/jfreechart/) - 2D chart library for Swing, JavaFX and server-side applications. (LGPL-2.1-only)
- [JGraphT](https://github.com/jgrapht/jgrapht) - Graph library that provides mathematical graph-theory objects and algorithms.
- [JGraphX](https://github.com/jgraph/jgraphx) - Library for visualizing (mainly Swing) and interacting with node-edge graphs.
- [LogicNG](https://github.com/logic-ng/LogicNG) - Library for creating, manipulating and solving Boolean and Pseudo-Boolean formulas.
- [Mines Java Toolkit](https://github.com/MinesJTK/jtk) - Library for geophysical scientific computation, visualization and digital signal analysis.
- [Morpheus](https://github.com/zavtech/morpheus-core) - Provides a versatile two-dimensional memory efficient tabular data structure called a DataFrame to enable efficient in-memory analytics for scientific computing on the JVM.
- [Orson-Charts](https://github.com/jfree/orson-charts) - Generates a wide variety of 3D charts that can be displayed with Swing and JavaFX or exported to PDF, SVG, PNG and JPEG. (GPL-3.0-only)
- [Tablesaw](https://github.com/jtablesaw/tablesaw) - Includes a data-frame, an embedded column store, and hundreds of methods to transform, summarize, or filter data.
- [XChart](https://github.com/knowm/XChart) - Light-weight library for plotting data. Many customizable chart types are available.

### Search

_Engines that index documents for search and analysis._

- [Apache Lucene](https://lucene.apache.org) - High-performance, full-featured, cross-platform, text search engine library.
- [Apache Solr](https://lucene.apache.org/solr/) - Enterprise search engine optimized for high-volume traffic.
- [Elasticsearch](https://www.elastic.co) - Distributed, multitenant-capable, full-text search engine with a RESTful web interface and schema-free JSON documents.
- [Indexer4j](https://github.com/haeungun/indexer4j) - Simple and light full text indexing and searching library.

### Security

_Libraries that handle security, authentication, authorization or session management._

- [Apache Shiro](https://shiro.apache.org) - Performs authentication, authorization, cryptography and session management.
- [Bouncy Castle](https://www.bouncycastle.org/java.html) - All-purpose cryptographic library and JCA provider offering a wide range of functions, from basic helpers to PGP/SMIME operations.
- [Cryptomator](https://cryptomator.org) - Multiplatform, transparent, client-side encryption of files in the cloud. (GPL-3.0-only)
- [Hdiv](https://github.com/hdiv/hdiv) - Runtime application that repels application security risks included in the OWASP Top 10, including SQL injection, cross-site scripting, cross-site request forgery, data tampering, and brute force attacks.
- [jjwt](https://github.com/jwtk/jjwt) - JSON web token for Java and Android.
- [Jwks RSA](https://github.com/auth0/jwks-rsa-java) - JSON Web Key Set parser.
- [Kalium](https://github.com/abstractj/kalium) - Binding for the Networking and Cryptography (NaCl) library.
- [Keycloak](https://www.keycloak.org) - Integrated SSO and IDM for browser apps and RESTful web services.
- [Keywhiz](https://github.com/square/keywhiz) - System for distributing and managing secrets.
- [Nbvcxz](https://github.com/GoSimpleLLC/nbvcxz) - Advanced password strength estimation.
- [OACC](http://oaccframework.org) - Provides permission-based authorization services.
- [OTP-Java](https://github.com/BastiaanJansen/OTP-Java) - One-time password generator library according to RFC 4226 (HOTP) and RFC 6238 (TOTP).
- [pac4j](https://github.com/pac4j/pac4j) - Security engine.
- [Password4j](https://github.com/Password4j/password4j) - User-friendly cryptographic library that supports Argon2, Bcrypt, Scrypt, PBKDF2 and various other cryptographic hash functions.
- [SecurityBuilder](https://github.com/tersesystems/securitybuilder) - Fluent Builder API for JCA and JSSE classes and especially X.509 certificates.
- [SSLContext-Kickstart](https://github.com/Hakky54/sslcontext-kickstart) - High-level SSL context builder for configuring HTTP clients with SSL/TLS.
- [Themis](https://github.com/cossacklabs/themis) - Multi-platform high-level cryptographic library provides easy-to-use encryption for protecting sensitive data: secure messaging with forward secrecy, secure data storage (AES256GCM); suits for building end-to-end encrypted applications.
- [Tink](https://github.com/google/tink) - Provides a simple and misuse-proof API for common cryptographic tasks.

### Serialization

_Libraries that handle serialization with high efficiency._

- [FlatBuffers](https://github.com/google/flatbuffers) - Memory-efficient serialization library that can access serialized data without unpacking and parsing it.
- [FST](https://github.com/RuedigerMoeller/fast-serialization) - JDK-compatible, high-performance object graph serialization.
- [Kryo](https://github.com/EsotericSoftware/kryo) - Fast and efficient object graph serialization framework.
- [MessagePack](https://github.com/msgpack/msgpack-java) - Efficient binary serialization format.
- [PHP Serializer](https://github.com/marcospassos/java-php-serializer) - Serializing objects in the PHP serialization format.

### Server

_Servers specifically used to deploy applications._

- [Apache Tomcat](https://tomcat.apache.org) - Robust, all-round server for Servlet and JSP.
- [Apache TomEE](https://tomee.apache.org) - Tomcat plus Java EE.
- [Jetty](https://www.eclipse.org/jetty/) - Provides a Web server and javax.servlet container, plus support for HTTP/2, WebSocket, OSGi, JMX, JNDI, JAAS and many other integrations.
- [nanohttpd](https://github.com/NanoHttpd/nanohttpd) - Tiny, easily embeddable HTTP server.
- [WildFly](https://www.wildfly.org) - Formerly known as JBoss and developed by Red Hat with extensive Java EE support. (LGPL-2.1-only)

### Template Engine

_Tools that substitute expressions in a template._

- [Freemarker](https://freemarker.apache.org) - Library to generate text output (HTML web pages, e-mails, configuration files, source code, etc.) based on templates and changing data.
- [Handlebars.java](https://jknack.github.io/handlebars.java/) - Logicless and semantic Mustache templates.
- [Jade4J](https://github.com/neuland/jade4j) - Implementation of Pug (formerly known as Jade).
- [Jamal](https://github.com/verhas/jamal) - Extendable template engine embedded into Maven/JavaDoc, supporting multiple extensions (Groovy, Ruby, JavaScript, JShell, PlantUml) with support for snippet handling.
- [jte](https://github.com/casid/jte) - Compiles to classes, and uses an easy syntax, several features to make development easier and provides fast execution and a small footprint.
- [Jtwig](https://github.com/jtwig/jtwig) - Modular, configurable and fully tested template engine.
- [Pebble](https://pebbletemplates.io) - Inspired by Twig and separates itself with its inheritance feature and its easy-to-read syntax. It ships with built-in autoescaping for security and it includes integrated support for internationalization.
- [Rocker](https://github.com/fizzed/rocker) - Optimized, memory efficient and speedy template engine producing statically typed, plain objects.
- [StringTemplate](https://github.com/antlr/stringtemplate4) - Template engine for generating source code, web pages, emails, or any other formatted text output.
- [Thymeleaf](https://www.thymeleaf.org) - Aims to be a substitute for JSP and works for XML files.

### Testing

_Tools that test from model to the view._

#### Asynchronous

_Tools that simplify testing asynchronous services._

- [Awaitility](https://github.com/awaitility/awaitility) - DSL for synchronizing asynchronous operations.
- [ConcurrentUnit](https://github.com/jhalterman/concurrentunit) - Toolkit for testing multi-threaded and asynchronous applications.
- [GreenMail](http://www.icegreen.com/greenmail/) - In-memory email server for integration testing. Supports SMTP, POP3 and IMAP including SSL. (GPL-2.0-only)
- [Hoverfly Java](https://github.com/SpectoLabs/hoverfly-java) - Native bindings for Hoverfly, a proxy which allows you to simulate HTTP services.
- [Karate](https://github.com/intuit/karate) - DSL that combines API test-automation, mocks and performance-testing making testing REST/HTTP services easy.
- [REST Assured](https://github.com/rest-assured/rest-assured) - DSL for easy testing of REST/HTTP services.

#### BDD

_Testing for the software development process that emerged from TDD and was heavily influenced by DDD and OOAD._

- [Cucumber](https://github.com/cucumber/cucumber-jvm) - Provides a way to describe features in a plain language which customers can understand.
- [Cukes-REST](https://github.com/ctco/cukes) - Collection of Gherkin steps for REST-service testing using Cucumber.
- [J8Spec](https://github.com/j8spec/j8spec) - Follows a Jasmine-like syntax.
- [JBehave](https://jbehave.org) - Extensively configurable framework that describes stories.
- [JGiven](http://jgiven.org) - Provides a fluent API which allows for simpler composition.
- [Lamdba Behave](https://github.com/RichardWarburton/lambda-behave) - Aims to provide a fluent API to write tests in long and descriptive sentences that read like plain English.
- [Serenity BDD](https://github.com/serenity-bdd/serenity-core) - Automated Acceptance testing and reporting library that works with Cucumber, JBehave and JUnit to make it easier to write high quality executable specifications.

#### Fixtures

_Everything related to the creation and handling of random data._

- [Beanmother](https://github.com/keepcosmos/beanmother) - Sets up beans from YAML fixtures.
- [Fixture Factory](https://github.com/six2six/fixture-factory) - Generates fake objects from a template.
- [jFairy](https://github.com/Devskiller/jfairy) - Fake data generator.
- [Randomized Testing](https://github.com/randomizedtesting/randomizedtesting) - JUnit test runner and plugins for running JUnit tests with pseudo-randomness.
- [Java Faker](https://github.com/DiUS/java-faker) - Port of Ruby's fake data generator.

#### Frameworks

_Provide environments to run tests for a specific use case._

- [ArchUnit](https://github.com/TNG/ArchUnit) - Test library for specifying and asserting architecture rules.
- [Apache JMeter](http://jmeter.apache.org) - Functional testing and performance measurements.
- [Arquillian](http://arquillian.org) - Integration and functional testing platform for Java EE containers.
- [Citrus](https://citrusframework.org) - Integration testing framework that focuses on both client- and server-side messaging.
- [Gatling](https://gatling.io) - Load testing tool designed for ease of use, maintainability and high performance.
- [JUnit](https://junit.org/junit5/) - Common testing framework.
- [jqwik](https://jqwik.net) - Engine for property-based testing built on JUnit 5.
- [Pact JVM](https://github.com/DiUS/pact-jvm) - Consumer-driven contract testing.
- [PIT](http://pitest.org) - Fast mutation-testing framework for evaluating fault-detection abilities of existing JUnit or TestNG test suites.

#### Matchers

_Libraries that provide custom matchers._

- [AssertJ](https://joel-costigliola.github.io/assertj/) - Fluent assertions that improve readability.
- [Hamcrest](http://hamcrest.org/JavaHamcrest/) - Matchers that can be combined to create flexible expressions of intent.
- [JSONAssert](http://jsonassert.skyscreamer.org) - Simplifies testing JSON strings.
- [Truth](https://truth.dev) - Google's fluent assertion and proposition framework.
- [XMLUnit](https://github.com/xmlunit/xmlunit) - Simplifies testing for XML output.

#### Miscellaneous

_Other stuff related to testing._

- [ConsoleCaptor](https://github.com/Hakky54/console-captor) - Captures console output for unit testing purposes.
- [junit-dataprovider](https://github.com/TNG/junit-dataprovider) - TestNG-like data provider/runner for JUnit.
- [LogCaptor](https://github.com/Hakky54/log-captor) - Captures log entries for unit testing purposes.
- [Mutability Detector](https://github.com/MutabilityDetector/MutabilityDetector) - Reports whether instances of a given class are immutable.
- [raml-tester](https://github.com/nidi3/raml-tester) - Tests if a request/response matches a given RAML definition.
- [TestContainers](https://github.com/testcontainers/testcontainers-java) - Provides throwaway instances of common databases, Selenium web browsers, or anything else that can run in a Docker container.
- [pojo-tester](https://www.pojo.pl) - Automatically performs tests on basic POJO methods. (LGPL-3.0-only)

#### Mocking

_Tools which mock collaborators to help testing single, isolated units._

- [JMockit](http://jmockit.github.io) - Integration testing, API mocking and faking, and code coverage.
- [Mockito](https://github.com/mockito/mockito) - Mocking framework that lets you write tests with a clean and simple API.
- [MockServer](https://www.mock-server.com) - Allows mocking of systems integrated with HTTPS.
- [Moco](https://github.com/dreamhead/moco) - Concise web services for stubs and mocks.
- [PowerMock](https://github.com/powermock/powermock) - Mocks static methods, constructors, final classes and methods, private methods, and removal of static initializers.
- [WireMock](http://wiremock.org) - Stubs and mocks web services.

### Utility

_Libraries which provide general utility functions._

- [Arthas](https://github.com/alibaba/arthas) - Allows to troubleshoot production issues for applications without modifying code or restarting servers.
- [bucket4j](https://github.com/vladimir-bukhtoyarov/bucket4j) - Rate limiting library based on token-bucket algorithm.
- [cactoos](https://github.com/yegor256/cactoos) - Collection of object-oriented primitives.
- [CRaSH](http://www.crashub.org) - Provides a shell into a JVM that's running CRaSH. Used by Spring Boot and others. (LGPL-2.1-or-later)
- [Dex](https://github.com/PatMartin/Dex) - Java/JavaFX tool capable of powerful ETL and data visualization.
- [Embulk](https://github.com/embulk/embulk) - Bulk data loader that helps data transfer between various databases, storages, file formats, and cloud services.
- [fswatch](https://github.com/vorburger/ch.vorburger.fswatch) - Micro library to watch for directory file system changes, simplifying java.nio.file.WatchService.
- [Gephi](https://github.com/gephi/gephi) - Cross-platform for visualizing and manipulating large graph networks. (GPL-3.0-only)
- [Guava](https://github.com/google/guava) - Collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O, and more.
- [JADE](http://jade.tilab.com) - Framework and environment for building and debugging multi-agent systems. (LGPL-2.0-only)
- [Java Diff Utils](https://java-diff-utils.github.io/java-diff-utils/) - Utilities for text or data comparison and patching.
- [JavaVerbalExpressions](https://github.com/VerbalExpressions/JavaVerbalExpressions) - Library that helps with constructing difficult regular expressions.
- [JGit](https://www.eclipse.org/jgit/) - Lightweight, pure Java library implementing the Git version control system.
- [minio-java](https://github.com/minio/minio-java) - Provides simple APIs to access any Amazon S3-compatible object storage server.
- [Protégé](https://protege.stanford.edu) - Provides an ontology editor and a framework to build knowledge-based systems.
- [Underscore-java](https://github.com/javadev/underscore-java) - Port of Underscore.js functions.

### Version Managers

_Utilities that help create the development shell environment and switch between different Java versions._

- [jabba](https://github.com/shyiko/jabba) - Java Version Manager inspired by nvm. Supports macOS, Linux and Windows.
- [jenv](https://github.com/jenv/jenv) - Java Version Manager inspired by rbenv. Can configure globally or per project. Tested on Debian and macOS.
- [SDKMan](https://github.com/sdkman/sdkman-cli) - Java Version Manager inspired by RVM and rbenv. Supports UNIX-based platforms and Windows.

### Web Crawling

_Libraries that analyze the content of websites._

- [Apache Nutch](https://nutch.apache.org) - Highly extensible, highly scalable web crawler for production environments.
- [Crawler4j](https://github.com/yasserg/crawler4j) - Simple and lightweight web crawler.
- [jsoup](https://jsoup.org) - Scrapes, parses, manipulates and cleans HTML.
- [StormCrawler](http://stormcrawler.net) - SDK for building low-latency and scalable web crawlers.
- [webmagic](https://github.com/code4craft/webmagic) - Scalable crawler with downloading, url management, content extraction and persistent.

### Web Frameworks

_Frameworks that handle the communication between the layers of a web application._

- [ActiveJ](https://activej.io) - Lightweight asynchronous framework built from the ground up for developing high-performance web applications.
- [Apache Tapestry](https://tapestry.apache.org) - Component-oriented framework for creating dynamic, robust, highly scalable web applications.
- [Apache Wicket](https://wicket.apache.org) - Component-based web application framework similar to Tapestry, with a stateful GUI.
- [Blade](https://github.com/lets-blade/blade) - Lightweight, modular framework that aims to be elegant and simple.
- [Bootique](https://bootique.io) - Minimally opinionated framework for runnable apps.
- [Firefly](http://www.fireflysource.com) - Asynchronous framework for rapid development of high-performance web application.
- [Jooby](http://www.jooby.org) - Scalable, fast and modular micro-framework that offers multiple programming models.
- [Ninja](http://www.ninjaframework.org) - Full-stack web framework.
- [Pippo](http://www.pippo.ro) - Small, highly modularized, Sinatra-like framework.
- [Play](https://www.playframework.com) - Built on Akka, it provides predictable and minimal resource consumption (CPU, memory, threads) for highly-scalable applications in Java and Scala.
- [PrimeFaces](https://www.primefaces.org) - JSF framework with both free and commercial/support versions and frontend components.
- [Ratpack](https://ratpack.io) - Set of libraries that facilitate fast, efficient, evolvable and well-tested HTTP applications.
- [Takes](https://github.com/yegor256/takes) - Opinionated web framework which is built around the concepts of True Object-Oriented Programming and immutability.
- [Vaadin](https://vaadin.com) - Event-driven framework that uses standard web components. Server-side architecture with Ajax on the client side.

### Workflow Orchestration Engines

- [Cadence](https://cadenceworkflow.io) - Stateful code platform from Uber.
- [flowable](https://github.com/flowable/flowable-engine) - Compact and efficient workflow and business process management platform.
- [Temporal](https://temporal.io) - Microservice orchestration platform, forked from Cadence but gRPC based.

## Resources

### Related Awesome Lists

_Awesome Lists related to the Java & JVM ecosystem._

- [Awesome Annotation Processing](https://github.com/gunnarmorling/awesome-annotation-processing)
- [Awesome Graal](https://github.com/neomatrix369/awesome-graal)
- [Awesome Gradle Plugins](https://github.com/ksoichiro/awesome-gradle)
- [AwesomeJavaFX](https://github.com/mhrimaz/AwesomeJavaFX)
- [Awesome JVM](https://github.com/deephacks/awesome-jvm)
- [Awesome Microservices](https://github.com/mfornos/awesome-microservices)
- [Awesome REST](https://github.com/marmelab/awesome-rest)
- [Awesome Selenium](https://github.com/christian-bromann/awesome-selenium)
- [ciandcd](https://github.com/ciandcd/awesome-ciandcd)
- [Useful Java Links](https://github.com/Vedenin/useful-java-links)
- [Java Concurrency Checklist](https://github.com/code-review-checklists/java-concurrency)
- [Java Developer Roadmap](https://github.com/s4kibs4mi/java-developer-roadmap)

### Communities

_Active discussions._

- [r/java](https://www.reddit.com/r/java/) - Subreddit for the Java community.
- [Stack Overflow](https://stackoverflow.com/questions/tagged/java) - Question/answer platform.
- [VirtualJUG](https://virtualjug.com) - Virtual Java User Group.

### Frontends

_Websites that provide a frontend for this list. Please note, there won't be an official website. We don't associate with a particular website and everybody is allowed to create one._

- [java.libhunt.com](https://java.libhunt.com)

### Influential Books

_Books that made a big impact and are still worth reading._

- [Core Java Volume I--Fundamentals](https://www.amazon.com/Core-Java-I-Fundamentals-10th/dp/0134177304)
- [Core Java, Volume II--Advanced Features](https://www.amazon.com/Core-Java-II-Advanced-Features-10th/dp/0134177290)
- [Effective Java (3rd Edition)](https://www.amazon.com/Effective-Java-3rd-Joshua-Bloch/dp/0134685997)
- [Java Concurrency in Practice](https://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601)
- [Thinking in Java](https://www.amazon.com/Thinking-Java-Edition-Bruce-Eckel/dp/0131872486)

### Podcasts and Screencasts

_Something to look at or listen to while programming._

- [A Bootiful Podcast](https://bootifulpodcast.fm)
- [Inside Java](https://inside.java/podcast) (Official)
- [Java Off Heap](http://www.javaoffheap.com)
- [The Java Council](https://virtualjug.com/#podcast)
- [The Java Posse](http://www.javaposse.com) - Discontinued as of 02/2015.

### People

#### Twitter

_Active accounts to follow. Descriptions from Twitter._

- [Adam Bien](https://twitter.com/AdamBien) - Freelance author, JavaOne Rockstar speaker, consultant, Java Champion.
- [Aleksey Shipilëv](https://twitter.com/shipilev) - Performance geek, benchmarking czar, concurrency bug hunter.
- [Antonio Goncalves](https://twitter.com/agoncal) - Java Champion, JUG Leader, Devoxx France, Java EE 6/7, JCP, Author.
- [Arun Gupta](https://twitter.com/arungupta) - Java Champion, JavaOne Rockstar, JUG Leader, Devoxx4Kids-er, VP of Developer Advocacy at Couchbase.
- [Brian Goetz](https://twitter.com/BrianGoetz) - Java Language Architect at Oracle.
- [Bruno Borges](https://twitter.com/brunoborges) - Product Manager/Java Jock at Oracle.
- [Chris Richardson](https://twitter.com/crichardson) - Software architect, consultant, and serial entrepreneur, Java Champion, JavaOne Rock Star, \*POJOs in Action- author.
- [Ed Burns](https://twitter.com/edburns) - Consulting Member of the Technical Staff at Oracle.
- [Eugen Paraschiv](https://twitter.com/baeldung) - Author of the Spring Security Course.
- [Heinz Kabutz](https://twitter.com/heinzkabutz) - Java Champion, speaker, author of The Java Specialists' Newsletter, concurrency performance expert.
- [Holly Cummins](https://twitter.com/holly_cummins) - Technical Lead of IBM London's Bluemix Garage, Java Champion, developer, author, JavaOne rockstar.
- [James Weaver](https://twitter.com/JavaFXpert) - Java/JavaFX/IoT developer, author and speaker.
- [Java EE](https://twitter.com/Java_EE) - Official Java EE Twitter account.
- [Java Magazine](https://twitter.com/Oraclejavamag) - Official Java Magazine account.
- [Java](https://twitter.com/java) - Official Java Twitter account.
- [Javin Paul](https://twitter.com/javinpaul) - Well-known Java blogger.
- [Josh Long](https://twitter.com/starbuxman) - Spring Advocate at Pivotal, author of O'Reilly's Cloud Native Java- and Building Microservices with Spring Boot, JavaOne Rock Star.
- [Lukas Eder](https://twitter.com/lukaseder) - Java Champion, speaker, Founder and CEO Data Geekery (jOOQ).
- [Mani Sarkar](https://twitter.com/theNeomatrix369) - Java champion, Polyglot, Software Crafter involved with @graalvm, AI/ML/DL, Data Science, Developer communities, speaker & blogger. Creator of couple of awesome lists like this one.
- [Mario Fusco](https://twitter.com/mariofusco) - RedHatter, JUG coordinator, frequent speaker and author.
- [Mark Heckler](https://twitter.com/MkHeck) - Pivotal Principal Technologist and Developer Advocate, conference speaker, published author, and Java Champion, focusing on Internet of Things and the cloud.
- [Mark Reinhold](https://twitter.com/mreinhold) - Chief Architect, Java Platform Group, Oracle.
- [Markus Eisele](https://twitter.com/myfear) - Java EE evangelist, Red Hat.
- [Martijn Verburg](https://twitter.com/karianna) - London JUG co-leader, speaker, author, Java Champion and much more.
- [Martin Thompson](https://twitter.com/mjpt777) - Pasty faced performance gangster.
- [Monica Beckwith](https://twitter.com/mon_beck) - Performance consultant, JavaOne Rock Star.
- [OpenJDK](https://twitter.com/OpenJDK) - Official OpenJDK account.
- [Peter Lawrey](https://twitter.com/PeterLawrey) - Peter Lawrey, Java performance expert.
- [Randy Shoup](https://twitter.com/randyshoup) - Stitch Fix VP Engineering, speaker, JavaOne Rock Star.
- [Reza Rahman](https://twitter.com/reza_rahman) - Java EE/GlassFish/WebLogic evangelist, author, speaker, open source hacker.
- [Sander Mak](https://twitter.com/Sander_Mak) - Java Champion, author.
- [Simon Maple](https://twitter.com/sjmaple) - Java Champion, VirtualJUG founder, LJC leader, RebelLabs author.
- [Spencer Gibb](https://twitter.com/spencerbgibb) - Software Engineer, Dad, Geek, Co-founder and Lead of Spring Cloud Core @pivotal.
- [Stephen Colebourne](https://twitter.com/jodastephen) - Java Champion, speaker.
- [Trisha Gee](https://twitter.com/trisha_gee) - Java Champion and speaker.
- [Venkat Subramaniam](https://twitter.com/venkat_s) - Author, University of Houston professor, MicroSoft MVP award recipient, JavaOne Rock Star, Java Champion.
- [Vlad Mihalcea](https://twitter.com/vlad_mihalcea) - Java Champion working on Hypersistence Optimizer, database aficionado, author of High-Performance Java Persistence book.

#### Other

- [Groundbreakers](https://apexapps.oracle.com/pls/apex/f?p=119297:3::::::) - Oracle ACEs, Groundbreaker Ambassadors and Java Champions.

### Websites

_Sites to read._

- [Baeldung](https://www.baeldung.com)
- [Dzone](https://dzone.com)
- [foojay.io](https://foojay.io)
- [Google Java Style](https://google.github.io/styleguide/javaguide.html)
- [InfoQ](https://www.infoq.com)
- [Java Algorithms and Clients](https://algs4.cs.princeton.edu/code)
- [Java, SQL, and jOOQ](https://blog.jooq.org)
- [Java.net](https://community.oracle.com/community/java)
- [Javalobby](https://dzone.com/java-jdk-development-tutorials-tools-news)
- [JavaWorld](https://www.javaworld.com)
- [JAXenter](https://jaxenter.com)
- [RebelLabs](https://zeroturnaround.com/rebellabs)
- [OverOps Blog](https://blog.overops.com)
- [TheServerSide.com](http://www.theserverside.com)
- [Vanilla Java](https://vanilla-java.github.io)
- [Voxxed](https://www.voxxed.com)

## Contributing

Contributions are very welcome!

Please have a look at the [CONTRIBUTING](https://github.com/veilair/java-development/blob/master/CONTRIBUTING.md) guidelines and [the validation tools](https://github.com/veilair/java-lint-development).




## Web Links

A curated list of awesome Java frameworks, libraries and software.

* [CyC2018/CS-Notes](https://github.com/CyC2018/CS-Notes) - :books: 技术面试必备基础知识、Leetcode、计算机操作系统、计算机网络、系统设计
* [Snailclimb/JavaGuide](https://github.com/Snailclimb/JavaGuide) - 「Java学习+面试指南」一份涵盖大部分 Java 程序员所需要掌握的核心知识。准备 Java 面试，首选 JavaGuide！
* [iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns) - Design patterns implemented in Java
* [doocs/advanced-java](https://github.com/doocs/advanced-java) - 😮 Core Interview Questions & Answers For Experienced Java(Backend) Developers | 互联网 Java 工程师进阶知识完全扫盲：涵盖高并发、分布式、高可用、微服务、海量数据处理等领域知识
* [spring-projects/spring-boot](https://github.com/spring-projects/spring-boot) - Spring Boot
* [elastic/elasticsearch](https://github.com/elastic/elasticsearch) - Free and Open, Distributed, RESTful Search Engine
* [macrozheng/mall](https://github.com/macrozheng/mall) - mall项目是一套电商系统，包括前台商城系统及后台管理系统，基于SpringBoot+MyBatis实现，采用Docker容器化部署。 前台商城系统包含首页门户、商品推荐、商品搜索、商品展示、购物车、订单流程、会员中心、客户服务、帮助中心等模块。 后台管理系统包含商品管理、订单管理、会员管理、促销管理、运营管理、内容管理、统计报表、财务管理、权限管理、设置等模块。
* [kdn251/interviews](https://github.com/kdn251/interviews) - Everything you need to know to get the job.
* [ReactiveX/RxJava](https://github.com/ReactiveX/RxJava) - RxJava – Reactive Extensions for the JVM – a library for composing asynchronous and event-based programs using observable sequences for the Java VM.
* [google/guava](https://github.com/google/guava) - Google core libraries for Java
* [TheAlgorithms/Java](https://github.com/TheAlgorithms/Java) - All Algorithms implemented in Java
* [square/retrofit](https://github.com/square/retrofit) - A type-safe HTTP client for Android and the JVM
* [apache/dubbo](https://github.com/apache/dubbo) - Apache Dubbo is a high-performance, java based, open source RPC framework.
* [PhilJay/MPAndroidChart](https://github.com/PhilJay/MPAndroidChart) - A powerful 🚀 Android chart view / graph view library, supporting line- bar- pie- radar- bubble- and candlestick charts as well as scaling, panning and animations.
* [zxing/zxing](https://github.com/zxing/zxing) - ZXing ("Zebra Crossing") barcode scanning library for Java, Android
* [skylot/jadx](https://github.com/skylot/jadx) - Dex to Java decompiler
* [alibaba/arthas](https://github.com/alibaba/arthas) - Alibaba Java Diagnostic Tool Arthas/Alibaba Java诊断利器Arthas
* [ityouknow/spring-boot-examples](https://github.com/ityouknow/spring-boot-examples) - about learning Spring Boot via examples. Spring Boot 教程、技术栈示例代码，快速简单上手教程。
* [jeecgboot/jeecg-boot](https://github.com/jeecgboot/jeecg-boot) - 「企业级低代码平台」前后端分离架构SpringBoot 2.x，SpringCloud，Ant Design&Vue，Mybatis-plus，Shiro，JWT。强大的代码生成器让前后端代码一键生成，无需写任何代码! 引领新的开发模式OnlineCoding->代码生成->手工MERGE，帮助Java项目解决70%重复工作，让开发更关注业务，既能快速提高效率，帮助公司节省成本，同时又不失灵活性。
* [crossoverJie/JCSprout](https://github.com/crossoverJie/JCSprout) - 👨‍🎓 Java Core Sprout : basic, concurrent, algorithm
* [xkcoding/spring-boot-demo](https://github.com/xkcoding/spring-boot-demo) - 该项目已成功集成 actuator(监控)、admin(可视化监控)、logback(日志)、aopLog(通过AOP记录web请求日志)、统一异常处理(json级别和页面级别)、freemarker(模板引擎)、thymeleaf(模板引擎)、Beetl(模板引擎)、Enjoy(模板引擎)、JdbcTemplate(通用JDBC操作数据库)、JPA(强大的ORM框架)、mybatis(强大的ORM框架)、通用Mapper(快速操作Mybatis)、PageHelper(通用的Mybatis分页插件)、mybatis-plus(快速操作Mybatis)、BeetlSQL(强大的ORM框架)、upload(本地文件上传和七牛云文件上传)、redis(缓存)、ehcache(缓存)、email(发送各种类型邮件)、task(基础定时任务)、quartz(动态管理定时任务)、xxl-job(分布式定时任务)、swagger(API接口管理测试)、security(基于RBAC的动态权限认证)、SpringSession(Session共享)、Zookeeper(结合AOP实现分布式锁)、RabbitMQ(消息队列)、Kafka(消息队列)、websocket(服务端推送监控服务器运行信息)、socket.io(聊天室)、ureport2(中国式报表)、打包成war文件、集成 ElasticSearch(基本操作和高级查询)、Async(异步任务)、集成Dubbo(采用官方的starter)、MongoDB(文档数据库)、neo4j(图数据库)、docker(容器化)、JPA多数据源、Mybatis多数据源、代码生成器、GrayLog(日志收集)、JustAuth(第三方登录)、LDAP(增删改查)、动态添加/切换数据源、单机限流(AOP + Guava RateLimiter)、分布式限流(AOP + Redis + Lua)、ElasticSearch 7.x(使用官方 Rest High Level Client)、HTTPS、Flyway(数据库初始化)、UReport2(中国式复杂报表)。
* [alibaba/fastjson](https://github.com/alibaba/fastjson) - A fast JSON parser/generator for Java.
* [dbeaver/dbeaver](https://github.com/dbeaver/dbeaver) - Free universal database tool and SQL client
* [greenrobot/EventBus](https://github.com/greenrobot/EventBus) - Event bus for Android and Java that simplifies communication between Activities, Fragments, Threads, Services, etc. Less code, better quality.
* [SeleniumHQ/selenium](https://github.com/SeleniumHQ/selenium) - A browser automation framework and ecosystem.
* [alibaba/easyexcel](https://github.com/alibaba/easyexcel) - 快速、简洁、解决大文件内存溢出的java处理Excel工具
* [hollischuang/toBeTopJavaer](https://github.com/hollischuang/toBeTopJavaer) - To Be Top Javaer - Java工程师成神之路
* [dromara/hutool](https://github.com/dromara/hutool) - 🍬A set of tools that keep Java sweet.
* [alibaba/spring-cloud-alibaba](https://github.com/alibaba/spring-cloud-alibaba) - Spring Cloud Alibaba provides a one-stop solution for application development for the distributed solutions of Alibaba middleware.
* [google/gson](https://github.com/google/gson) - A Java serialization/deserialization library to convert Java Objects into JSON and back
* [xuxueli/xxl-job](https://github.com/xuxueli/xxl-job) - A distributed task scheduling framework.（分布式任务调度平台XXL-JOB）
* [libgdx/libgdx](https://github.com/libgdx/libgdx) - Desktop/Android/HTML5/iOS Java game development framework
* [google/ExoPlayer](https://github.com/google/ExoPlayer) - An extensible media player for Android
* [jenkinsci/jenkins](https://github.com/jenkinsci/jenkins) - Jenkins automation server
* [alibaba/Sentinel](https://github.com/alibaba/Sentinel) - A powerful flow control component enabling reliability, resilience and monitoring for microservices. (面向云原生微服务的高可用流控防护组件)
* [redisson/redisson](https://github.com/redisson/redisson) - Redisson - Redis Java client with features of In-Memory Data Grid. Over 50 Redis based Java objects and services: Set, Multimap, SortedSet, Map, List, Queue, Deque, Semaphore, Lock, AtomicLong, Map Reduce, Publish / Subscribe, Bloom filter, Spring Cache, Tomcat, Scheduler, JCache API, Hibernate, MyBatis, RPC, local cache ...
* [apache/flink](https://github.com/apache/flink) - Apache Flink
* [mybatis/mybatis-3](https://github.com/mybatis/mybatis-3) - MyBatis SQL mapper framework for Java
* [oracle/graal](https://github.com/oracle/graal) - GraalVM: Run Programs Faster Anywhere :rocket:
* [dianping/cat](https://github.com/dianping/cat) - CAT 作为服务端项目基础组件，提供了 Java, C/C++, Node.js, Python, Go 等多语言客户端，已经在美团点评的基础架构中间件框架（MVC框架，RPC框架，数据库框架，缓存框架等，消息队列，配置系统等）深度集成，为美团点评各业务线提供系统丰富的性能指标、健康状况、实时告警等。
* [brettwooldridge/HikariCP](https://github.com/brettwooldridge/HikariCP) - 光 HikariCP・A solid, high-performance, JDBC connection pool at last.
* [winterbe/java8-tutorial](https://github.com/winterbe/java8-tutorial) - Modern Java - A Guide to Java 8
* [android10/Android-CleanArchitecture](https://github.com/android10/Android-CleanArchitecture) - This is a sample app that is part of a series of blog posts I have written about how to architect an android application using Uncle Bob's clean architecture approach.
* [LMAX-Exchange/disruptor](https://github.com/LMAX-Exchange/disruptor) - High Performance Inter-Thread Messaging Library
* [Anuken/Mindustry](https://github.com/Anuken/Mindustry) - The automation tower defense game
* [medcl/elasticsearch-analysis-ik](https://github.com/medcl/elasticsearch-analysis-ik) - The IK Analysis plugin integrates Lucene IK analyzer into elasticsearch, support customized dictionary.
* [orhanobut/logger](https://github.com/orhanobut/logger) - ✔️ Simple, pretty and powerful logger for android
* [prestodb/presto](https://github.com/prestodb/presto) - The official home of the Presto distributed SQL query engine for big data
* [Konloch/bytecode-viewer](https://github.com/Konloch/bytecode-viewer) - A Java 8+ Jar & Android APK Reverse Engineering Suite (Decompiler, Editor, Debugger & More)
* [eclipse-vertx/vert.x](https://github.com/eclipse-vertx/vert.x) - Vert.x is a tool-kit for building reactive applications on the JVM
* [mockito/mockito](https://github.com/mockito/mockito) - Most popular Mocking framework for unit tests written in Java
* [eclipse/deeplearning4j](https://github.com/eclipse/deeplearning4j) - Suite of tools for deploying and training deep learning models using the JVM. Highlights include model import for keras, tensorflow, and onnx/pytorch, a modular and tiny c++ library for running math code and a java based math library on top of the core c++ library. Also includes samediff: a pytorch/tensorflow like library for running deep learning using automatic differentiation.
* [openjdk/jdk](https://github.com/openjdk/jdk) - JDK main-line development
* [GoogleContainerTools/jib](https://github.com/GoogleContainerTools/jib) - 🏗 Build container images for your Java applications.
* [antlr/antlr4](https://github.com/antlr/antlr4) - ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for reading, processing, executing, or translating structured text or binary files.
* [realm/realm-java](https://github.com/realm/realm-java) - Realm is a mobile database: a replacement for SQLite & ORMs
* [androidannotations/androidannotations](https://github.com/androidannotations/androidannotations) - Fast Android Development. Easy maintainance.
* [Yalantis/uCrop](https://github.com/Yalantis/uCrop) - Image Cropping Library for Android
* [ben-manes/caffeine](https://github.com/ben-manes/caffeine) - A high performance caching library for Java
* [permissions-dispatcher/PermissionsDispatcher](https://github.com/permissions-dispatcher/PermissionsDispatcher) - A declarative API to handle Android runtime permissions.
* [OpenRefine/OpenRefine](https://github.com/OpenRefine/OpenRefine) - OpenRefine is a free, open source power tool for working with messy data and improving it
* [roughike/BottomBar](https://github.com/roughike/BottomBar) - (Deprecated) A custom view component that mimics the new Material Design Bottom Navigation pattern.
* [Blankj/awesome-java-leetcode](https://github.com/Blankj/awesome-java-leetcode) - :crown: LeetCode of algorithms with java solution(updating).
* [stanfordnlp/CoreNLP](https://github.com/stanfordnlp/CoreNLP) - Stanford CoreNLP: A Java suite of core NLP tools.
* [Activiti/Activiti](https://github.com/Activiti/Activiti) - Activiti is a light-weight workflow and Business Process Management (BPM) Platform targeted at business people, developers and system admins. Its core is a super-fast and rock-solid BPMN 2 process engine for Java. It's open-source and distributed under the Apache license. Activiti runs in any Java application, on a server, on a cluster or in the cloud. It integrates perfectly with Spring, it is extremely lightweight and based on simple concepts.
* [junit-team/junit4](https://github.com/junit-team/junit4) - A programmer-oriented testing framework for Java.
* [cats-oss/android-gpuimage](https://github.com/cats-oss/android-gpuimage) - Android filters based on OpenGL (idea from GPUImage for iOS)
* [florent37/MaterialViewPager](https://github.com/florent37/MaterialViewPager) - A Material Design ViewPager easy to use library
* [facebook/buck](https://github.com/facebook/buck) - A fast build system that encourages the creation of small, reusable modules over a variety of platforms and languages.
* [dropwizard/dropwizard](https://github.com/dropwizard/dropwizard) - A damn simple library for building production-ready RESTful web services.
* [jwtk/jjwt](https://github.com/jwtk/jjwt) - Java JWT: JSON Web Token for Java and Android
* [macrozheng/mall-swarm](https://github.com/macrozheng/mall-swarm) - mall-swarm是一套微服务商城系统，采用了 Spring Cloud Hoxton & Alibaba、Spring Boot 2.3、Oauth2、MyBatis、Docker、Elasticsearch、Kubernetes等核心技术，同时提供了基于Vue的管理后台方便快速搭建系统。mall-swarm在电商业务的基础集成了注册中心、配置中心、监控中心、网关等系统功能。文档齐全，附带全套Spring Cloud教程。
* [square/moshi](https://github.com/square/moshi) - A modern JSON library for Kotlin and Java.
* [hs-web/hsweb-framework](https://github.com/hs-web/hsweb-framework) - hsweb (haʊs wɛb) 是一个基于spring-boot 2.x开发 ,首个使用全响应式编程的企业级后台管理系统基础项目。
* [OpenFeign/feign](https://github.com/OpenFeign/feign) - Feign makes writing java http clients easier
* [questdb/questdb](https://github.com/questdb/questdb) - An open source SQL database designed to process time series data, faster
* [dromara/Sa-Token](https://github.com/dromara/Sa-Token) - 这可能是史上功能最全的Java权限认证框架！目前已集成——登录认证、权限认证、分布式Session会话、微服务网关鉴权、单点登录、OAuth2.0、踢人下线、Redis集成、前后台分离、记住我模式、模拟他人账号、临时身份切换、账号封禁、多账号认证体系、注解式鉴权、路由拦截式鉴权、花式token生成、自动续签、同端互斥登录、会话治理、密码加密、jwt集成、Spring集成、WebFlux集成...
* [kaushikgopal/RxJava-Android-Samples](https://github.com/kaushikgopal/RxJava-Android-Samples) - Learning RxJava for Android by example
* [dropwizard/metrics](https://github.com/dropwizard/metrics) - :chart_with_upwards_trend: Capturing JVM- and application-level metrics. So you know what's going on.
* [square/dagger](https://github.com/square/dagger) - A fast dependency injector for Android and Java.
* [Bearded-Hen/Android-Bootstrap](https://github.com/Bearded-Hen/Android-Bootstrap) - Bootstrap style widgets for Android, with Glyph Icons
* [cymcsg/UltimateRecyclerView](https://github.com/cymcsg/UltimateRecyclerView) - A RecyclerView(advanced and flexible version of ListView in Android) with refreshing,loading more,animation and many other features.
* [vipshop/vjtools](https://github.com/vipshop/vjtools) - The vip.com's java coding standard, libraries and tools
* [apache/cassandra](https://github.com/apache/cassandra) - Mirror of Apache Cassandra
* [google/android-classyshark](https://github.com/google/android-classyshark) - Android and Java bytecode viewer
* [java-native-access/jna](https://github.com/java-native-access/jna) - Java Native Access
* [swagger-api/swagger-core](https://github.com/swagger-api/swagger-core) - Examples and server integrations for generating the Swagger API Specification, which enables easy access to your REST API
* [cryptomator/cryptomator](https://github.com/cryptomator/cryptomator) - Multi-platform transparent client-side encryption of your files in the cloud
* [ionic-team/capacitor](https://github.com/ionic-team/capacitor) - Build cross-platform Native Progressive Web Apps for iOS, Android, and the Web ⚡️
* [json-path/JsonPath](https://github.com/json-path/JsonPath) - Java JsonPath implementation
* [checkstyle/checkstyle](https://github.com/checkstyle/checkstyle) - Checkstyle is a development tool to help programmers write Java code that adheres to a coding standard. By default it supports the Google Java Style Guide and Sun Code Conventions, but is highly configurable. It can be invoked with an ANT task and a command line program.
* [spring-projects/spring-security](https://github.com/spring-projects/spring-security) - Spring Security
* [flyway/flyway](https://github.com/flyway/flyway) - Flyway by Redgate • Database Migrations Made Easy.
* [apache/storm](https://github.com/apache/storm) - Mirror of Apache Storm
* [NanoHttpd/nanohttpd](https://github.com/NanoHttpd/nanohttpd) - Tiny, easily embeddable HTTP server in Java.
* [processing/processing](https://github.com/processing/processing) - Source code for the Processing Core and Development Environment (PDE)
* [NLPchina/ansj_seg](https://github.com/NLPchina/ansj_seg) - ansj分词.ict的真正java实现.分词效果速度都超过开源版的ict. 中文分词,人名识别,词性标注,用户自定义词典
* [rey5137/material](https://github.com/rey5137/material) - A library to bring fully animated Material Design components to pre-Lolipop Android.
* [AsyncHttpClient/async-http-client](https://github.com/AsyncHttpClient/async-http-client) - Asynchronous Http and WebSocket Client library for Java
* [google/j2objc](https://github.com/google/j2objc) - A Java to iOS Objective-C translation tool and runtime.
* [apache/jmeter](https://github.com/apache/jmeter) - Apache JMeter
* [real-logic/aeron](https://github.com/real-logic/aeron) - Efficient reliable UDP unicast, UDP multicast, and IPC message transport
* [google/error-prone](https://github.com/google/error-prone) - Catch common Java mistakes as compile-time errors
* [apache/tomcat](https://github.com/apache/tomcat) - Apache Tomcat
* [prolificinteractive/material-calendarview](https://github.com/prolificinteractive/material-calendarview) - A Material design back port of Android's CalendarView
* [apache/incubator-shenyu](https://github.com/apache/incubator-shenyu) - ShenYu is High-Performance Java API Gateway.
* [sshahine/JFoenix](https://github.com/sshahine/JFoenix) - JavaFX Material Design Library
* [rest-assured/rest-assured](https://github.com/rest-assured/rest-assured) - Java DSL for easy testing of REST services
* [febsteam/FEBS-Shiro](https://github.com/febsteam/FEBS-Shiro) - Spring Boot 2.4.2，Shiro1.6.0 & Layui 2.5.6 权限管理系统。预览地址：http://47.104.70.138:8080/login
* [JakeWharton/DiskLruCache](https://github.com/JakeWharton/DiskLruCache) - Java implementation of a Disk-based LRU cache which specifically targets Android compatibility.
* [joelittlejohn/jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo) - Generate Java types from JSON or JSON Schema and annotate those types for data-binding with Jackson, Gson, etc
* [mrniko/netty-socketio](https://github.com/mrniko/netty-socketio) - Socket.IO server implemented on Java. Realtime java framework
* [bytedeco/javacv](https://github.com/bytedeco/javacv) - Java interface to OpenCV, FFmpeg, and more
* [kunal-kushwaha/DSA-Bootcamp-Java](https://github.com/kunal-kushwaha/DSA-Bootcamp-Java) - This repository consists of the code samples, assignments, and the curriculum for the Community Classroom complete Data Structures & Algorithms Java bootcamp.
* [liyifeng1994/ssm](https://github.com/liyifeng1994/ssm) - 手把手教你整合最优雅SSM框架：SpringMVC + Spring + MyBatis
* [testcontainers/testcontainers-java](https://github.com/testcontainers/testcontainers-java) - Testcontainers is a Java library that supports JUnit tests, providing lightweight, throwaway instances of common databases, Selenium web browsers, or anything else that can run in a Docker container.
* [apache/zeppelin](https://github.com/apache/zeppelin) - Web-based notebook that enables data-driven, interactive data analytics and collaborative documents with SQL, Scala and more.
* [facebookarchive/rebound](https://github.com/facebookarchive/rebound) - A Java library that models spring dynamics and adds real world physics to your app.
* [springfox/springfox](https://github.com/springfox/springfox) - Automated JSON API documentation for API's built with Spring
* [sockeqwe/mosby](https://github.com/sockeqwe/mosby) - A Model-View-Presenter / Model-View-Intent library for modern Android apps
* [PaperMC/Paper](https://github.com/PaperMC/Paper) - High performance Spigot fork that aims to fix gameplay and mechanics inconsistencies
* [h2pl/Java-Tutorial](https://github.com/h2pl/Java-Tutorial) - 【Java工程师面试复习指南】本仓库涵盖大部分Java程序员所需要掌握的核心知识，整合了互联网上的很多优质Java技术文章，力求打造为最完整最实用的Java开发者学习指南，如果对你有帮助，给个star告诉我吧，谢谢！
* [robolectric/robolectric](https://github.com/robolectric/robolectric) - Android Unit Testing Framework
* [evant/gradle-retrolambda](https://github.com/evant/gradle-retrolambda) - A gradle plugin for getting java lambda support in java 6, 7 and android
* [graphql-java/graphql-java](https://github.com/graphql-java/graphql-java) - GraphQL Java implementation
* [MindorksOpenSource/from-java-to-kotlin](https://github.com/MindorksOpenSource/from-java-to-kotlin) - From Java To Kotlin - Your Cheat Sheet For Java To Kotlin
* [changmingxie/tcc-transaction](https://github.com/changmingxie/tcc-transaction) - tcc-transaction是TCC型事务java实现
* [scribejava/scribejava](https://github.com/scribejava/scribejava) - Simple OAuth library for Java
* [Yalantis/Side-Menu.Android](https://github.com/Yalantis/Side-Menu.Android) - Side menu with some categories to choose.
* [apache/beam](https://github.com/apache/beam) - Apache Beam is a unified programming model for Batch and Streaming
* [MinecraftForge/MinecraftForge](https://github.com/MinecraftForge/MinecraftForge) - Modifications to the Minecraft base files to assist in compatibility between mods.
* [micronaut-projects/micronaut-core](https://github.com/micronaut-projects/micronaut-core) - Micronaut Application Framework
* [CameraKit/camerakit-android](https://github.com/CameraKit/camerakit-android) - Library for Android Camera 1 and 2 APIs. Massively increase stability and reliability of photo and video capture on all Android devices.
* [Vedenin/useful-java-links](https://github.com/Vedenin/useful-java-links) - A list of useful Java frameworks, libraries, software and hello worlds examples
* [wasabeef/Blurry](https://github.com/wasabeef/Blurry) - Blurry is an easy blur library for Android
* [amitshekhariitbhu/RxJava2-Android-Samples](https://github.com/amitshekhariitbhu/RxJava2-Android-Samples) - RxJava 2 Android Examples - Migration From RxJava 1 to RxJava 2 - How to use RxJava 2 in Android
* [junit-team/junit5](https://github.com/junit-team/junit5) - ✅ The 5th major version of the programmer-friendly testing framework for Java and the JVM
* [orhanobut/dialogplus](https://github.com/orhanobut/dialogplus) - Advanced dialog solution for android
* [btraceio/btrace](https://github.com/btraceio/btrace) - BTrace - a safe, dynamic tracing tool for the Java platform
* [frohoff/ysoserial](https://github.com/frohoff/ysoserial) - A proof-of-concept tool for generating payloads that exploit unsafe Java object deserialization.
* [Ramotion/folding-cell-android](https://github.com/Ramotion/folding-cell-android) - :octocat: 📃  FoldingCell is a material design expanding content cell inspired by folding paper material made by @Ramotion
* [socketio/socket.io-client-java](https://github.com/socketio/socket.io-client-java) - Full-featured Socket.IO Client Library for Java, which is compatible with Socket.IO v1.0 and later.
* [hibernate/hibernate-orm](https://github.com/hibernate/hibernate-orm) - Hibernate's core Object/Relational Mapping functionality
* [wiremock/wiremock](https://github.com/wiremock/wiremock) - A tool for mocking HTTP services
* [ffay/lanproxy](https://github.com/ffay/lanproxy) - lanproxy是一个将局域网个人电脑、服务器代理到公网的内网穿透工具，支持tcp流量转发，可支持任何tcp上层协议（访问内网网站、本地支付接口调试、ssh访问、远程桌面、http代理、https代理、socks5代理...）。技术交流QQ群 678776401
* [AriaLyy/Aria](https://github.com/AriaLyy/Aria) - 下载可以很简单
* [mapstruct/mapstruct](https://github.com/mapstruct/mapstruct) - An annotation processor for generating type-safe bean mappers
* [JodaOrg/joda-time](https://github.com/JodaOrg/joda-time) - Joda-Time is the widely used replacement for the Java date and time classes prior to Java SE 8.
* [alibaba/transmittable-thread-local](https://github.com/alibaba/transmittable-thread-local) - 📌 TransmittableThreadLocal (TTL), the missing Java™ std lib(simple & 0-dependency) for framework/middleware, provide an enhanced InheritableThreadLocal that transmits values between threads even using thread pooling components.
* [mcxiaoke/packer-ng-plugin](https://github.com/mcxiaoke/packer-ng-plugin) - 下一代Android打包工具，100个渠道包只需要10秒钟
* [jOOQ/jOOQ](https://github.com/jOOQ/jOOQ) - jOOQ is the best way to write SQL in Java
* [raphw/byte-buddy](https://github.com/raphw/byte-buddy) - Runtime code generation for the Java virtual machine.
* [hazelcast/hazelcast](https://github.com/hazelcast/hazelcast) -  Open-source distributed computation and storage platform
* [trinodb/trino](https://github.com/trinodb/trino) - Official repository of Trino, the distributed SQL query engine for big data, formerly known as PrestoSQL (https://trino.io)
* [awsdocs/aws-doc-sdk-examples](https://github.com/awsdocs/aws-doc-sdk-examples) - Welcome to the AWS Code Examples Repository.  This repo contains code examples used in the AWS documentation, AWS SDK Developer Guides, and more. For more information, see the Readme.rst file below.
* [vavr-io/vavr](https://github.com/vavr-io/vavr) - vʌvr (formerly called Javaslang) is a non-commercial, non-profit object-functional library that runs with Java 8+. It aims to reduce the lines of code and increase code quality.
* [gephi/gephi](https://github.com/gephi/gephi) - Gephi - The Open Graph Viz Platform
* [SplashCodes/JAViewer](https://github.com/SplashCodes/JAViewer) - 更优雅的驾车体验
* [981011512/--](https://github.com/981011512/--) - 停车场系统源码，停车场小程序，智能停车，Parking system，【功能介绍】：①兼容市面上主流的多家相机，理论上兼容所有硬件，可灵活扩展，②相机识别后数据自动上传到云端并记录，校验相机唯一id和硬件序列号，防止非法数据录入，③用户手机查询停车记录详情可自主缴费(支持微信，支付宝，银行接口支付，支持每个停车场指定不同的商户进行收款)，支付后出场在免费时间内会自动抬杆。④支持app上查询附近停车场(导航，可用车位数，停车场费用，优惠券，评分，评论等)，可预约车位。⑤断电断网支持岗亭人员使用app可接管硬件进行停车记录的录入。 【技术架构】：后端开发语言java，框架oauth2+springboot2+dubble，数据库mysql/mongodb/redis，即时通讯底层框架netty4，安卓和ios均为原生开发，后台管理模板vue专业定制
* [auth0/java-jwt](https://github.com/auth0/java-jwt) - Java implementation of JSON Web Token (JWT)
* [spring-cloud/spring-cloud-netflix](https://github.com/spring-cloud/spring-cloud-netflix) - Integration with Netflix OSS components
* [nisrulz/android-tips-tricks](https://github.com/nisrulz/android-tips-tricks) - :ballot_box_with_check: [Cheatsheet] Tips and tricks for Android Development
* [ankidroid/Anki-Android](https://github.com/ankidroid/Anki-Android) - AnkiDroid: Anki flashcards on Android. Your secret trick to achieve superhuman information retention.
* [jankotek/mapdb](https://github.com/jankotek/mapdb) - MapDB provides concurrent Maps, Sets and Queues backed by disk storage or off-heap-memory. It is a fast and easy to use embedded Java database engine.
* [macrozheng/springcloud-learning](https://github.com/macrozheng/springcloud-learning) - 一套涵盖大部分核心组件使用的Spring Cloud教程，包括Spring Cloud Alibaba及分布式事务Seata，基于Spring Cloud Greenwich及SpringBoot 2.1.7。22篇文章，篇篇精华，32个Demo，涵盖大部分应用场景。
* [microg/GmsCore](https://github.com/microg/GmsCore) - Free implementation of Play Services
* [lettuce-io/lettuce-core](https://github.com/lettuce-io/lettuce-core) - Advanced Java Redis client for thread-safe sync, async, and reactive usage. Supports Cluster, Sentinel, Pipelining, and codecs.
* [puniverse/quasar](https://github.com/puniverse/quasar) - Fibers, Channels and Actors for the JVM
* [apache/hbase](https://github.com/apache/hbase) - Apache HBase
* [opensearch-project/OpenSearch](https://github.com/opensearch-project/OpenSearch) - 🔎 Open source distributed and RESTful search engine.
* [deathmarine/Luyten](https://github.com/deathmarine/Luyten) - An Open Source Java Decompiler Gui for Procyon
* [google/google-java-format](https://github.com/google/google-java-format) - Reformats Java source code to comply with Google Java Style.
* [2227324689/gpmall](https://github.com/2227324689/gpmall) - 【咕泡学院实战项目】-基于SpringBoot+Dubbo构建的电商平台-微服务架构、商城、电商、微服务、高并发、kafka、Elasticsearch
* [cglib/cglib](https://github.com/cglib/cglib) - cglib - Byte Code Generation Library is high level API to generate and transform Java byte code. It is used by AOP, testing, data access frameworks to generate dynamic proxy objects and intercept field access.
* [fuzhengwei/itstack-demo-design](https://github.com/fuzhengwei/itstack-demo-design) - :art: 《重学Java设计模式》是一本互联网真实案例实践书籍。以落地解决方案为核心，从实际业务中抽离出，交易、营销、秒杀、中间件、源码等22个真实场景，来学习设计模式的运用。欢迎关注小傅哥，微信(fustack)，公众号：bugstack虫洞栈，博客：https://bugstack.cn
* [yasserg/crawler4j](https://github.com/yasserg/crawler4j) - Open Source Web Crawler for Java
* [awangdev/LintCode](https://github.com/awangdev/LintCode) - Java Solutions to problems on LintCode/LeetCode
* [bitcoinj/bitcoinj](https://github.com/bitcoinj/bitcoinj) - A library for working with Bitcoin
* [hansonwang99/Spring-Boot-In-Action](https://github.com/hansonwang99/Spring-Boot-In-Action) - Spring Boot 系列实战合集
* [javagrowing/JGrowing](https://github.com/javagrowing/JGrowing) - Java is Growing up but not only Java。Java成长路线，但学到不仅仅是Java。
* [zuihou/lamp-cloud](https://github.com/zuihou/lamp-cloud) - lamp-cloud 基于Jdk11 + SpringCloud + SpringBoot的微服务快速开发平台，其中的可配置的SaaS功能尤其闪耀， 具备RBAC功能、网关统一鉴权、Xss防跨站攻击、自动代码生成、多种存储系统、分布式事务、分布式定时任务等多个模块，支持多业务系统并行开发， 支持多服务并行开发，可以作为后端服务的开发脚手架。代码简洁，注释齐全，架构清晰，非常适合学习和企业作为基础框架使用。
* [zhanglei-workspace/shopping-management-system](https://github.com/zhanglei-workspace/shopping-management-system) - 该项目为多个小项目的集合（持续更新中...）。内容类似淘宝、京东等网购管理系统以及图书管理、超市管理等系统。目的在于便于Java初级爱好者在学习完某一部分Java知识后有一个合适的项目锻炼、运用所学知识，完善知识体系。适用人群：Java基础到入门的爱好者。
* [kiegroup/drools](https://github.com/kiegroup/drools) - Drools is a rule engine, DMN engine and complex event processing (CEP) engine for Java.
* [apache/hive](https://github.com/apache/hive) - Apache Hive
* [apache/camel](https://github.com/apache/camel) - Apache Camel is an open source integration framework that empowers you to quickly and easily integrate various systems consuming or producing data.
* [Yalantis/Phoenix](https://github.com/Yalantis/Phoenix) - Phoenix Pull-to-Refresh
* [ZHENFENG13/spring-boot-projects](https://github.com/ZHENFENG13/spring-boot-projects) - 该仓库中主要是 Spring Boot 的入门学习教程以及一些常用的 Spring Boot 实战项目教程，包括 Spring Boot 使用的各种示例代码，同时也包括一些实战项目的项目源码和效果展示，实战项目包括基本的 web 开发以及目前大家普遍使用的线上博客项目/企业大型商城系统/前后端分离实践项目等，摆脱各种 hello world 入门案例的束缚，真正的掌握 Spring Boot 开发。
* [javaparser/javaparser](https://github.com/javaparser/javaparser) - Java 1-15 Parser and Abstract Syntax Tree for Java, including preview features to Java 13
* [stleary/JSON-java](https://github.com/stleary/JSON-java) - A reference implementation of a JSON package in Java.
* [iNPUTmice/Conversations](https://github.com/iNPUTmice/Conversations) - Conversations is an open source XMPP/Jabber client for Android
* [rengwuxian/RxJavaSamples](https://github.com/rengwuxian/RxJavaSamples) - RxJava 2 和 Retrofit 结合使用的几个最常见使用方式举例
* [ronmamo/reflections](https://github.com/ronmamo/reflections) - Java runtime metadata analysis
* [objectbox/objectbox-java](https://github.com/objectbox/objectbox-java) - ObjectBox is a superfast lightweight database for objects
* [phishman3579/java-algorithms-implementation](https://github.com/phishman3579/java-algorithms-implementation) - Algorithms and Data Structures implemented in Java
* [cabaletta/baritone](https://github.com/cabaletta/baritone) - google maps for block game
* [yuliskov/SmartTubeNext](https://github.com/yuliskov/SmartTubeNext) - Ad free app for watching tube videos on Android TV boxes
* [CalebFenton/simplify](https://github.com/CalebFenton/simplify) - Android virtual machine and deobfuscator
* [chewiebug/GCViewer](https://github.com/chewiebug/GCViewer) - Fork of tagtraum industries' GCViewer. Tagtraum stopped development in 2008, I aim to improve support for Sun's / Oracle's java 1.6+ garbage collector logs (including G1 collector)
* [coobird/thumbnailator](https://github.com/coobird/thumbnailator) - Thumbnailator - a thumbnail generation library for Java
* [brianway/java-learning](https://github.com/brianway/java-learning) - 旨在打造在线最佳的 Java 学习笔记，含博客讲解和源码实例，包括 Java SE 和 Java Web
* [bisq-network/bisq](https://github.com/bisq-network/bisq) - A decentralized bitcoin exchange network
* [oldmanpushcart/greys-anatomy](https://github.com/oldmanpushcart/greys-anatomy) - Java诊断工具
* [Netflix/conductor](https://github.com/Netflix/conductor) - Conductor is a microservices orchestration engine.
* [vespa-engine/vespa](https://github.com/vespa-engine/vespa) - The open big data serving engine. https://vespa.ai
* [bytedeco/javacpp](https://github.com/bytedeco/javacpp) - The missing bridge between Java and native C++
* [apache/pinot](https://github.com/apache/pinot) - Apache Pinot - A realtime distributed OLAP datastore
* [powermock/powermock](https://github.com/powermock/powermock) - PowerMock is a Java framework that allows you to unit test code normally regarded as untestable.
* [apache/shiro](https://github.com/apache/shiro) - Apache Shiro
* [pmd/pmd](https://github.com/pmd/pmd) - An extensible multilanguage static code analyzer.
* [TeamAmaze/AmazeFileManager](https://github.com/TeamAmaze/AmazeFileManager) - Material design file manager for Android
* [yangfuhai/ASimpleCache](https://github.com/yangfuhai/ASimpleCache) - a simple cache for android and java
* [oblac/jodd](https://github.com/oblac/jodd) - Jodd! Lightweight. Java. Zero dependencies. Use what you like.
* [querydsl/querydsl](https://github.com/querydsl/querydsl) - Unified Queries for Java
* [johncarl81/parceler](https://github.com/johncarl81/parceler) - :package: Android Parcelables made easy through code generation.
* [web3j/web3j](https://github.com/web3j/web3j) - Lightweight Java and Android library for integration with Ethereum clients
* [google/open-location-code](https://github.com/google/open-location-code) - Open Location Code is a library to generate short codes, called "plus codes", that can be used as digital addresses where street addresses don't exist.
* [mercyblitz/tech-weekly](https://github.com/mercyblitz/tech-weekly) - 「小马哥技术周报」
* [j-easy/easy-rules](https://github.com/j-easy/easy-rules) - The simple, stupid rules engine for Java
* [failsafe-lib/failsafe](https://github.com/failsafe-lib/failsafe) - Fault tolerance and resilience patterns for the JVM
* [Atmosphere/atmosphere](https://github.com/Atmosphere/atmosphere) - Realtime Client Server Framework for the JVM, supporting WebSockets with Cross-Browser Fallbacks
* [luontola/retrolambda](https://github.com/luontola/retrolambda) - Backport of Java 8's lambda expressions to Java 7, 6 and 5
* [LWJGL/lwjgl3](https://github.com/LWJGL/lwjgl3) - LWJGL is a Java library that enables cross-platform access to popular native APIs useful in the development of graphics (OpenGL, Vulkan), audio (OpenAL), parallel computing (OpenCL, CUDA) and XR (OpenVR, LibOVR) applications.
* [jitsi/jitsi](https://github.com/jitsi/jitsi) - Jitsi is an audio/video and chat communicator that supports protocols such as SIP, XMPP/Jabber, IRC and many other useful features.
* [CameraKit/blurkit-android](https://github.com/CameraKit/blurkit-android) - The missing Android blurring library. Fast blur-behind layout that parallels iOS.
* [tiann/epic](https://github.com/tiann/epic) - Dynamic java method AOP hook for Android(continution of Dexposed on ART), Supporting 5.0~11
* [graphhopper/graphhopper](https://github.com/graphhopper/graphhopper) - Open source routing engine for OpenStreetMap. Use it as Java library or standalone web server.
* [mock-server/mockserver](https://github.com/mock-server/mockserver) - MockServer enables easy mocking of any system you integrate with via HTTP or HTTPS with clients written in Java, JavaScript and Ruby.  MockServer also includes a proxy that introspects all proxied traffic including encrypted SSL traffic and supports Port Forwarding, Web Proxying (i.e. HTTP proxy), HTTPS Tunneling Proxying (using HTTP CONNECT) and SOCKS Proxying (i.e. dynamic port forwarding).
* [sofastack/sofa-rpc](https://github.com/sofastack/sofa-rpc) - SOFARPC is a high-performance, high-extensibility, production-level Java RPC  framework.
* [saysky/ForestBlog](https://github.com/saysky/ForestBlog) - 一个简单漂亮的SSM(Spring+SpringMVC+Mybatis)博客系统
* [oracle/opengrok](https://github.com/oracle/opengrok) - OpenGrok is a fast and usable source code search and cross reference engine, written in Java
* [mpusher/mpush](https://github.com/mpusher/mpush) - MPush开源实时消息推送系统
* [Col-E/Recaf](https://github.com/Col-E/Recaf) - The modern Java bytecode editor
* [JSQLParser/JSqlParser](https://github.com/JSQLParser/JSqlParser) - JSqlParser parses an SQL statement and translate it into a hierarchy of Java classes. The generated hierarchy can be navigated using the Visitor Pattern
* [knowm/XChange](https://github.com/knowm/XChange) - XChange is a Java library providing a streamlined API for interacting with 60+ Bitcoin and Altcoin exchanges providing a consistent interface for trading and accessing market data.
* [jboss-javassist/javassist](https://github.com/jboss-javassist/javassist) - Java bytecode engineering toolkit
* [RedSpider1/concurrent](https://github.com/RedSpider1/concurrent) - 这是RedSpider社区成员原创与维护的Java多线程系列文章。
* [traccar/traccar](https://github.com/traccar/traccar) - Traccar GPS Tracking System
* [promeG/TinyPinyin](https://github.com/promeG/TinyPinyin) - 适用于Java和Android的快速、低内存占用的汉字转拼音库。
* [spring-cloud/spring-cloud-gateway](https://github.com/spring-cloud/spring-cloud-gateway) - A Gateway built on Spring Framework 5.x and Spring Boot 2.x providing routing and more.
* [remkop/picocli](https://github.com/remkop/picocli) - Picocli is a modern framework for building powerful, user-friendly, GraalVM-enabled command line apps with ease. It supports colors, autocompletion, subcommands, and more.  In 1 source file so apps can include as source & avoid adding a dependency. Written in Java, usable from Groovy, Kotlin, Scala, etc.
* [liuyubobobo/Play-with-Algorithms](https://github.com/liuyubobobo/Play-with-Algorithms) - Codes of my MOOC Course <Play with Algorithms>, Both in C++ and Java language. Updated contents and practices are also included. 我在慕课网上的课程《算法与数据结构》示例代码，包括C++和Java版本。课程的更多更新内容及辅助练习也将逐步添加进这个代码仓。
* [networknt/light-4j](https://github.com/networknt/light-4j) - A fast, lightweight and more productive microservices framework
* [zlt2000/microservices-platform](https://github.com/zlt2000/microservices-platform) - 基于SpringBoot2.x、SpringCloud和SpringCloudAlibaba并采用前后端分离的企业级微服务多租户系统架构。并引入组件化的思想实现高内聚低耦合，项目代码简洁注释丰富上手容易，适合学习和企业中使用。真正实现了基于RBAC、jwt和oauth2的无状态统一权限认证的解决方案，面向互联网设计同时适合B端和C端用户，支持CI/CD多环境部署，并提供应用管理方便第三方系统接入；同时还集合各种微服务治理功能和监控功能。模块包括:企业级的认证系统、开发平台、应用监控、慢sql监控、统一日志、单点登录、Redis分布式高速缓存、配置中心、分布式任务调度、接口文档、代码生成等等。
* [sherxon/AlgoDS](https://github.com/sherxon/AlgoDS) - Implementation of Algorithms and Data Structures, Problems and Solutions
* [subhra74/xdm](https://github.com/subhra74/xdm) - Powerfull download accelerator and video downloader
* [eclipse/jetty.project](https://github.com/eclipse/jetty.project) - Eclipse Jetty® - Web Container & Clients - supports HTTP/2, HTTP/1.1, HTTP/1.0, websocket, servlets, and more
* [PowerJob/PowerJob](https://github.com/PowerJob/PowerJob) - Enterprise job scheduling middleware with distributed computing ability.
* [crate/crate](https://github.com/crate/crate) - CrateDB is a distributed SQL database that makes it simple to store and analyze massive amounts of machine data in real-time.
* [MovingBlocks/Terasology](https://github.com/MovingBlocks/Terasology) - Terasology - open source voxel world
* [kevinsawicki/http-request](https://github.com/kevinsawicki/http-request) - Java HTTP Request Library
* [ragunathjawahar/android-saripaar](https://github.com/ragunathjawahar/android-saripaar) - UI form validation library for Android
* [qunarcorp/bistoury](https://github.com/qunarcorp/bistoury) - Bistoury是去哪儿网的java应用生产问题诊断工具，提供了一站式的问题诊断方案
* [micrometer-metrics/micrometer](https://github.com/micrometer-metrics/micrometer) - An application metrics facade for the most popular monitoring tools. Think SLF4J, but for metrics.
* [alibaba/jetcache](https://github.com/alibaba/jetcache) - JetCache is a Java cache framework.
* [fyhertz/libstreaming](https://github.com/fyhertz/libstreaming) - A solution for streaming H.264, H.263, AMR, AAC using RTP on Android
* [chenBingX/SuperTextView](https://github.com/chenBingX/SuperTextView) - Hi，Developer，Welcome to use SuperTextView ！
* [NotFound9/interviewGuide](https://github.com/NotFound9/interviewGuide) - 《大厂面试指北》——包括Java基础、JVM、数据库、mysql、redis、计算机网络、算法、数据结构、操作系统、设计模式、系统设计、框架原理。最佳阅读地址：http://notfound9.github.io/interviewGuide/
* [jfinal/jfinal](https://github.com/jfinal/jfinal) - JAVA WEB + ORM Framework
* [DiUS/java-faker](https://github.com/DiUS/java-faker) - Brings the popular ruby faker gem to Java
* [fishercoder1534/Leetcode](https://github.com/fishercoder1534/Leetcode) - Solutions to LeetCode problems; updated daily. Subscribe to my YouTube channel for more.
* [jbloch/effective-java-3e-source-code](https://github.com/jbloch/effective-java-3e-source-code) - The source code from the third edition of Effective Java, with minor additions as necessary to make it runnable.
* [h2database/h2database](https://github.com/h2database/h2database) - H2 is an embeddable RDBMS written in Java.
* [WritingMinds/ffmpeg-android-java](https://github.com/WritingMinds/ffmpeg-android-java) - Android java library for FFmpeg binary compiled using https://github.com/writingminds/ffmpeg-android
* [alibaba/QLExpress](https://github.com/alibaba/QLExpress) - QLExpress is a powerful, lightweight, dynamic language for the Java platform aimed at improving developers’ productivity in different business scenes.
* [anggrayudi/android-hidden-api](https://github.com/anggrayudi/android-hidden-api) - A library that provides access to Android hidden APIs and internal resources.
* [spockframework/spock](https://github.com/spockframework/spock) - The Enterprise-ready testing and specification framework.
* [requery/requery](https://github.com/requery/requery) - requery - modern SQL based query & persistence for Java / Kotlin / Android
* [jacoco/jacoco](https://github.com/jacoco/jacoco) - :microscope: Java Code Coverage Library
* [guoguibing/librec](https://github.com/guoguibing/librec) - LibRec: A Leading Java Library for Recommender Systems, see
* [uber/NullAway](https://github.com/uber/NullAway) - A tool to help eliminate NullPointerExceptions (NPEs) in your Java code with low build-time overhead
* [immutables/immutables](https://github.com/immutables/immutables) - Annotation processor to create immutable objects and builders. Feels like Guava's immutable collections but for regular value objects. JSON, Jackson, Gson, JAX-RS integrations included
* [lenve/JavaEETest](https://github.com/lenve/JavaEETest) - Spring、SpringMVC、MyBatis、Spring Boot案例
* [Red5/red5-server](https://github.com/Red5/red5-server) - Red5 Server core
* [supertokens/supertokens-core](https://github.com/supertokens/supertokens-core) - Open source alternative to Auth0 / Firebase Auth / AWS Cognito
* [jasonross/Nuwa](https://github.com/jasonross/Nuwa) - Nuwa, pure java implementation, can hotfix your android application.
* [mxdldev/android-mvp-mvvm-flytour](https://github.com/mxdldev/android-mvp-mvvm-flytour) - 🔥🔥🔥 FlyTour是Android MVVM+MVP+Dagger2+Retrofit+RxJava+组件化+插件组成的双编码架构+双工程架构+双语言Android应用开发框架，通过不断的升级迭代该框架已经有了十个不同的版本，5.0之前工程架构采用gradle配置实现组件化，5.0之后的工程架构采用VirtualAPK实现了插件化，5.0之前采用Java编码实现，5.0之后采用Kotlin编码实现，编码架构由MVVM和MVP组成，工程架构和编码架构及编码语言开发者可根据自己具体的项目实际需求去决定选择使用，该框架是Android组件化、Android插件化、Android MVP架构、Android MVVM架构的集大成者，帮助你快速的搭建自己的App项目开发框架，以便把主要的精力放在自己的项目的业务功能实现上，另外在长期的工作实践中总结整理大量的实用工具类在项目lib_common组件的util包当中方便大家调用。
* [apache/nifi](https://github.com/apache/nifi) - Apache NiFi
* [ZieIony/Carbon](https://github.com/ZieIony/Carbon) - Material Design implementation for Android 4.0+. Shadows, ripples, vectors, fonts, animations, widgets, rounded corners and more.
* [liquibase/liquibase](https://github.com/liquibase/liquibase) - Main Liquibase Source
* [yusugomori/DeepLearning](https://github.com/yusugomori/DeepLearning) - Deep Learning (Python, C, C++, Java, Scala, Go)
* [oshi/oshi](https://github.com/oshi/oshi) - Native Operating System and Hardware Information
* [spring-cloud/spring-cloud-kubernetes](https://github.com/spring-cloud/spring-cloud-kubernetes) - Kubernetes integration with Spring Cloud Discovery Client, Configuration, etc...
* [ltsopensource/light-task-scheduler](https://github.com/ltsopensource/light-task-scheduler) - Distributed Scheduled Job Framework
* [gouthampradhan/leetcode](https://github.com/gouthampradhan/leetcode) - Leetcode solutions
* [GeyserMC/Geyser](https://github.com/GeyserMC/Geyser) - A bridge/proxy allowing you to connect to Minecraft: Java Edition servers with Minecraft: Bedrock Edition.
* [apache/maven](https://github.com/apache/maven) - Apache Maven core
* [jagrosh/MusicBot](https://github.com/jagrosh/MusicBot) - 🎶 A Discord music bot that's easy to set up and run yourself!
* [tronprotocol/java-tron](https://github.com/tronprotocol/java-tron) - Java implementation of the Tron whitepaper
* [CrawlScript/WebCollector](https://github.com/CrawlScript/WebCollector) - WebCollector is an open source web crawler framework based on Java.It provides some simple interfaces for crawling the Web,you can setup a multi-threaded web crawler in less than 5 minutes.
* [nanchen2251/RxJava2Examples](https://github.com/nanchen2251/RxJava2Examples) - :fire:RxJava2 Examples —— 这可能是从 RxJava1 跳到 RxJava2（学习 RxJava2 ）最好的例子 Demo：https://github.com/nanchen2251/RxJava2Examples
* [apache/calcite](https://github.com/apache/calcite) - Apache Calcite
* [szerhusenBC/jwt-spring-security-demo](https://github.com/szerhusenBC/jwt-spring-security-demo) - A demo for using JWT (Json Web Token) with Spring Security and Spring Boot 2
* [AweiLoveAndroid/CommonDevKnowledge](https://github.com/AweiLoveAndroid/CommonDevKnowledge) - :octocat::fire: :star2::star::star::star: :star:  史上最全的BAT大厂Android面试题汇集，以及常用的Android开发的一些技能点，冷门知识点汇总，开发中遇到的坑汇总等干货。
* [jeecgboot/JimuReport](https://github.com/jeecgboot/JimuReport) - 「低代码可视化报表」类似excel操作风格，在线拖拽完成设计！功能涵盖: 报表设计、图形报表、打印设计、大屏设计等，完全免费！秉承“简单、易用、专业”的产品理念，极大的降低报表开发难度、缩短开发周期、解决各类报表难题。
* [jMonkeyEngine/jmonkeyengine](https://github.com/jMonkeyEngine/jmonkeyengine) - A complete 3-D game development suite written in Java.
* [awaitility/awaitility](https://github.com/awaitility/awaitility) - Awaitility is a small Java DSL for synchronizing asynchronous operations
* [killme2008/aviatorscript](https://github.com/killme2008/aviatorscript) - A high performance scripting language hosted on the JVM.
* [eclipse-openj9/openj9](https://github.com/eclipse-openj9/openj9) - Eclipse OpenJ9: A Java Virtual Machine for OpenJDK that's optimized for small footprint, fast start-up, and high throughput.   Builds on Eclipse OMR (https://github.com/eclipse/omr) and combines with the Extensions for OpenJDK for OpenJ9 repo.
* [FinalTeam/RxGalleryFinal](https://github.com/FinalTeam/RxGalleryFinal) - 图片选择库，单选/多选、拍照、裁剪、压缩，自定义。包括视频选择和录制。
* [jtablesaw/tablesaw](https://github.com/jtablesaw/tablesaw) - Java dataframe and visualization library
* [Mojang/brigadier](https://github.com/Mojang/brigadier) - Brigadier is a command parser & dispatcher, designed and developed for Minecraft: Java Edition.
* [florent37/ExpectAnim](https://github.com/florent37/ExpectAnim) - Describe your animation and run !
* [google/binnavi](https://github.com/google/binnavi) - BinNavi is a binary analysis IDE that allows to inspect, navigate, edit and annotate control flow graphs and call graphs of disassembled code.
* [RipMeApp/ripme](https://github.com/RipMeApp/ripme) - Downloads albums in bulk
* [rubenlagus/TelegramBots](https://github.com/rubenlagus/TelegramBots) - Java library to create bots using Telegram Bots API
* [Yalantis/GuillotineMenu-Android](https://github.com/Yalantis/GuillotineMenu-Android) - Neat library, that provides a simple way to implement guillotine-styled animation
* [youlookwhat/DesignPattern](https://github.com/youlookwhat/DesignPattern) - 📚 Java 23种设计模式全归纳
* [bastillion-io/Bastillion](https://github.com/bastillion-io/Bastillion) - Bastillion is a web-based SSH console that centrally manages administrative access to systems. Web-based administration is combined with management and distribution of user's public SSH keys.
* [pedrovgs/Algorithms](https://github.com/pedrovgs/Algorithms) - Solutions for some common algorithm problems written in Java.
* [lizhangqu/CoreLink](https://github.com/lizhangqu/CoreLink) - Android 开发中的日常积累
* [nextcloud/android](https://github.com/nextcloud/android) - 📱 Nextcloud Android app
* [bitcoin-wallet/bitcoin-wallet](https://github.com/bitcoin-wallet/bitcoin-wallet) - Bitcoin Wallet app for your Android device. Standalone Bitcoin node, no centralized backend required.
* [apache/curator](https://github.com/apache/curator) - Apache Curator
* [chanjarster/weixin-java-tools](https://github.com/chanjarster/weixin-java-tools) - 微信公众号、企业号Java SDK
* [DV8FromTheWorld/JDA](https://github.com/DV8FromTheWorld/JDA) - Java wrapper for the popular chat & VOIP service: Discord https://discord.com
* [sofastack/sofa-jraft](https://github.com/sofastack/sofa-jraft) - A production-grade java implementation of RAFT consensus algorithm.
* [r0adkll/Slidr](https://github.com/r0adkll/Slidr) - Easily add slide to dismiss functionality to an Activity
* [spring-projects/spring-loaded](https://github.com/spring-projects/spring-loaded) - Java agent that enables class reloading in a running JVM
* [rememberber/WePush](https://github.com/rememberber/WePush) - 专注批量推送的小而美的工具，目前支持：模板消息-公众号、模板消息-小程序、微信客服消息、微信企业号/企业微信消息、阿里云短信、阿里大于模板短信 、腾讯云短信、云片网短信、E-Mail、HTTP请求、钉钉、华为云短信、百度云短信、又拍云短信、七牛云短信
* [kabouzeid/Phonograph](https://github.com/kabouzeid/Phonograph) - A material designed music player for Android
* [brianway/webporter](https://github.com/brianway/webporter) - 基于 webmagic 的 Java 爬虫应用
* [apache/logging-log4j2](https://github.com/apache/logging-log4j2) - Apache Log4j 2 is an upgrade to Log4j that provides significant improvements over its predecessor, Log4j 1.x, and provides many of the improvements available in Logback while fixing some inherent problems in Logback's architecture.
* [spotify/docker-maven-plugin](https://github.com/spotify/docker-maven-plugin) - INACTIVE: A maven plugin for Docker
* [Twitter4J/Twitter4J](https://github.com/Twitter4J/Twitter4J) - Twitter4J is an open-sourced, mavenized and Google App Engine safe Java library for the Twitter API which is released under the Apache License 2.0.
* [spotbugs/spotbugs](https://github.com/spotbugs/spotbugs) - SpotBugs is FindBugs' successor. A tool for static analysis to look for bugs in Java code.
* [geoserver/geoserver](https://github.com/geoserver/geoserver) - Official GeoServer repository
* [AxonFramework/AxonFramework](https://github.com/AxonFramework/AxonFramework) - Framework for Evolutionary Event-Driven Microservices on the JVM
* [spring-projects/spring-data-elasticsearch](https://github.com/spring-projects/spring-data-elasticsearch) - Provide support to increase developer productivity in Java when using Elasticsearch. Uses familiar Spring concepts such as a template classes for core API usage and lightweight repository style data access.
* [spotify/dockerfile-maven](https://github.com/spotify/dockerfile-maven) - MATURE: A set of Maven tools for dealing with Dockerfiles
* [yingLanNull/ShadowImageView](https://github.com/yingLanNull/ShadowImageView) - 🔥可以根据图片内容变阴影颜色，更加细腻的阴影效果  It can change color according to the picture, more delicate shadow effect
* [oracle/helidon](https://github.com/oracle/helidon) - Java libraries for writing microservices
* [real-logic/simple-binary-encoding](https://github.com/real-logic/simple-binary-encoding) - Simple Binary Encoding (SBE) - High Performance Message Codec
* [AdoptOpenJDK/jitwatch](https://github.com/AdoptOpenJDK/jitwatch) - Log analyser / visualiser for Java HotSpot JIT compiler. Inspect inlining decisions, hot methods, bytecode, and assembly. View results in the JavaFX user interface.
* [shopizer-ecommerce/shopizer](https://github.com/shopizer-ecommerce/shopizer) - Shopizer java e-commerce software
* [VerbalExpressions/JavaVerbalExpressions](https://github.com/VerbalExpressions/JavaVerbalExpressions) - Java regular expressions made easy.
* [williamfiset/DEPRECATED-data-structures](https://github.com/williamfiset/DEPRECATED-data-structures) - A collection of powerful data structures
* [jOOQ/jOOR](https://github.com/jOOQ/jOOR) -  jOOR - Fluent Reflection in Java jOOR is a very simple fluent API that gives access to your Java Class structures in a more intuitive way. The JDK's reflection APIs are hard and verbose to use. Other languages have much simpler constructs to access type meta information at runtime. Let us make Java reflection better.
* [JsonChao/Awesome-WanAndroid](https://github.com/JsonChao/Awesome-WanAndroid) - :zap:致力于打造一款极致体验的 http://www.wanandroid.com/ 客户端，知识和美是可以并存的哦QAQn(*≧▽≦*)n
* [OpenHFT/Chronicle-Queue](https://github.com/OpenHFT/Chronicle-Queue) - Micro second messaging that stores everything to disk
* [Ramotion/paper-onboarding-android](https://github.com/Ramotion/paper-onboarding-android) - :octocat: PaperOnboarding is a material design slider made by @Ramotion
* [javamelody/javamelody](https://github.com/javamelody/javamelody) - JavaMelody : monitoring of JavaEE applications
* [balysv/material-menu](https://github.com/balysv/material-menu) - Animations for Android L drawer, back, dismiss and check icons
* [Krupen/FabulousFilter](https://github.com/Krupen/FabulousFilter) - Android library to animate Floating Action Button to Bottom Sheet Dialog and vice-versa
* [RoaringBitmap/RoaringBitmap](https://github.com/RoaringBitmap/RoaringBitmap) - A better compressed bitset in Java
* [sannies/mp4parser](https://github.com/sannies/mp4parser) - A Java API to read, write and create MP4 files
* [FudanNLP/fnlp](https://github.com/FudanNLP/fnlp) - 中文自然语言处理工具包 Toolkit for Chinese natural language processing
* [kiegroup/optaplanner](https://github.com/kiegroup/optaplanner) - AI constraint solver in Java to optimize the vehicle routing problem, employee rostering, task assignment, maintenance scheduling, conference scheduling and other planning problems.
* [javaee-samples/javaee7-samples](https://github.com/javaee-samples/javaee7-samples) - Java EE 7 Samples
* [Qihoo360/ArgusAPM](https://github.com/Qihoo360/ArgusAPM) - Powerful, comprehensive (Android) application performance management platform. 360线上移动性能检测平台
* [mongodb/mongo-java-driver](https://github.com/mongodb/mongo-java-driver) - The Java driver for MongoDB
* [jetlinks/jetlinks-community](https://github.com/jetlinks/jetlinks-community) - JetLinks  基于Java8,Spring Boot 2.x ,WebFlux,Netty,Vert.x,Reactor等开发, 是一个全响应式的企业级物联网平台。支持统一物模型管理,多种设备,多种厂家,统一管理。统一设备连接管理,多协议适配(TCP,MQTT,UDP,CoAP,HTTP等),屏蔽网络编程复杂性,灵活接入不同厂家不同协议等设备。实时数据处理,设备告警,消息通知,数据转发。地理位置,数据可视化等。能帮助你快速建立物联网相关业务系统。
* [igniterealtime/Openfire](https://github.com/igniterealtime/Openfire) - An XMPP server licensed under the Open Source Apache License.
* [nutzam/nutz](https://github.com/nutzam/nutz) - Nutz -- Web Framework(Mvc/Ioc/Aop/Dao/Json) for ALL Java developer
* [ZHENFENG13/My-Blog](https://github.com/ZHENFENG13/My-Blog) - :palm_tree::octocat:A simple & beautiful blogging system implemented with spring-boot & thymeleaf & mybatis My Blog 是由 SpringBoot + Mybatis + Thymeleaf 等技术实现的 Java 博客系统，页面美观、功能齐全、部署简单及完善的代码，一定会给使用者无与伦比的体验
* [camunda/camunda-bpm-platform](https://github.com/camunda/camunda-bpm-platform) - Flexible framework for workflow and decision automation with BPMN and DMN. Integration with Spring, Spring Boot, CDI.
* [fuzhengwei/small-spring](https://github.com/fuzhengwei/small-spring) - 🌱《 Spring 手撸专栏》，本专栏以 Spring 源码学习为目的，通过手写简化版 Spring 框架，了解 Spring 核心原理。在手写的过程中会简化 Spring 源码，摘取整体框架中的核心逻辑，简化代码实现过程，保留核心功能，例如：IOC、AOP、Bean生命周期、上下文、作用域、资源处理等内容实现。
* [JabRef/jabref](https://github.com/JabRef/jabref) - Graphical Java application for managing BibTeX and biblatex (.bib) databases
* [tdebatty/java-string-similarity](https://github.com/tdebatty/java-string-similarity) - Implementation of various string similarity and distance algorithms: Levenshtein, Jaro-winkler, n-Gram, Q-Gram, Jaccard index, Longest Common Subsequence edit distance, cosine similarity ...
* [AlmasB/FXGL](https://github.com/AlmasB/FXGL) - Java / JavaFX / Kotlin Game Library (Engine)
* [VictorAlbertos/RxCache](https://github.com/VictorAlbertos/RxCache) - Reactive caching library for Android and Java
* [square/tape](https://github.com/square/tape) - A lightning fast, transactional, file-based FIFO for Android and Java.
* [fesh0r/fernflower](https://github.com/fesh0r/fernflower) - Unofficial mirror of FernFlower Java decompiler (All pulls should be submitted upstream)
* [nayuki/QR-Code-generator](https://github.com/nayuki/QR-Code-generator) - High-quality QR Code generator library in Java, TypeScript/JavaScript, Python, Rust, C++, C.
* [liyiorg/weixin-popular](https://github.com/liyiorg/weixin-popular) - 微信SDK  JAVA  (公众平台、开放平台、 商户平台、 服务商平台)
* [RodneyShag/HackerRank_solutions](https://github.com/RodneyShag/HackerRank_solutions) - 317 efficient solutions to HackerRank problems
* [charles2gan/GDA-android-reversing-Tool](https://github.com/charles2gan/GDA-android-reversing-Tool) - GDA is a new fast and powerful decompiler in C++(working without Java VM) for the APK, DEX, ODEX, OAT, JAR, AAR, and CLASS file. which supports malicious behavior detection, privacy leaking detection, vulnerability detection, path solving, packer identification, variable tracking, deobfuscation, python&java scripts, device memory extraction, data decryption, and encryption, etc.
* [cucumber/cucumber-jvm](https://github.com/cucumber/cucumber-jvm) - Cucumber for the JVM
* [google/truth](https://github.com/google/truth) - Fluent assertions for Java and Android
* [s4kibs4mi/java-developer-roadmap](https://github.com/s4kibs4mi/java-developer-roadmap) - Roadmap to becoming a Java developer in 2021
* [apache/incubator-linkis](https://github.com/apache/incubator-linkis) - Linkis helps easily connect to various back-end computation/storage engines(Spark, Python, TiDB...), exposes various interfaces(REST, JDBC, Java ...), with multi-tenancy, high performance, and resource control.
* [JPressProjects/jpress](https://github.com/JPressProjects/jpress) - JPress，一个使用 Java 开发的建站神器，目前已经有 10w+ 网站使用 JPress 进行驱动，其中包括多个政府机构，200+上市公司，中科院、红+字会等。
* [federicoiosue/Omni-Notes](https://github.com/federicoiosue/Omni-Notes) - Open source note-taking application for Android
* [balysv/material-ripple](https://github.com/balysv/material-ripple) - Android L Ripple effect wrapper for Views
* [Sayi/poi-tl](https://github.com/Sayi/poi-tl) - Generate awesome word(docx) with template
* [vdurmont/emoji-java](https://github.com/vdurmont/emoji-java) - The missing emoji library for Java :heart:
* [liweiwei1419/LeetCode-Solutions-in-Good-Style](https://github.com/liweiwei1419/LeetCode-Solutions-in-Good-Style) - 首页已经更新，希望能对大家有帮助。
* [EngineHub/WorldEdit](https://github.com/EngineHub/WorldEdit) - 🗺️ Minecraft map editor and mod
* [xtuhcy/gecco](https://github.com/xtuhcy/gecco) - Easy to use lightweight web crawler（易用的轻量化网络爬虫）
* [diffplug/spotless](https://github.com/diffplug/spotless) - Keep your code spotless
* [JetBrains/skija](https://github.com/JetBrains/skija) - Java bindings for Skia
* [qos-ch/logback](https://github.com/qos-ch/logback) - The reliable, generic, fast and flexible logging framework for Java.
* [LinShunKang/MyPerf4J](https://github.com/LinShunKang/MyPerf4J) - High performance Java APM. Powered by ASM. Try it. Test it. If you feel its better, use it.
* [deepjavalibrary/djl](https://github.com/deepjavalibrary/djl) - An Engine-Agnostic Deep Learning Framework in Java
* [apache/nutch](https://github.com/apache/nutch) - Apache Nutch is an extensible and scalable web crawler
* [Ramotion/cardslider-android](https://github.com/Ramotion/cardslider-android) - :octocat: 🃏 Cardslider is a material design UI controller that allows you to swipe through cards with pictures and accompanying descriptions.
* [pilgr/Paper](https://github.com/pilgr/Paper) - Paper is a fast NoSQL-like storage for Java/Kotlin objects on Android with automatic schema migration support.
* [igniterealtime/Smack](https://github.com/igniterealtime/Smack) - A modular and portable open source XMPP client library written in Java for Android and Java (SE) VMs
* [caoxinyu/RedisClient](https://github.com/caoxinyu/RedisClient) - Java Redis Client GUI Tool
* [thymeleaf/thymeleaf](https://github.com/thymeleaf/thymeleaf) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
* [spring-projects/spring-data-jpa](https://github.com/spring-projects/spring-data-jpa) - Simplifies the development of creating a JPA-based data access layer.
* [Yalantis/Euclid](https://github.com/Yalantis/Euclid) - User Profile Interface Animation
* [Kong/unirest-java](https://github.com/Kong/unirest-java) - Unirest in Java: Simplified, lightweight HTTP client library.
* [addthis/stream-lib](https://github.com/addthis/stream-lib) - Stream summarizer and cardinality estimator.
* [tchiotludo/akhq](https://github.com/tchiotludo/akhq) - Kafka GUI for Apache Kafka to manage topics, topics data, consumers group, schema registry, connect and more...
* [fabric8io/kubernetes-client](https://github.com/fabric8io/kubernetes-client) - Java client for Kubernetes & OpenShift
* [apache/flume](https://github.com/apache/flume) - Mirror of Apache Flume
* [Zhaoss/WeiXinRecordedDemo](https://github.com/Zhaoss/WeiXinRecordedDemo) - 仿微信视频拍摄UI, 基于ffmpeg的视频录制编辑
* [timusus/Shuttle](https://github.com/timusus/Shuttle) - Shuttle Music Player
* [LibrePDF/OpenPDF](https://github.com/LibrePDF/OpenPDF) - OpenPDF is a free Java library for creating and editing PDF files with a LGPL and MPL open source license. OpenPDF is based on a fork of iText. We welcome contributions from other developers. Please feel free to submit pull-requests and bugreports to this GitHub repository. ⛺
* [atomix/atomix](https://github.com/atomix/atomix) - A reactive Java framework for building fault-tolerant distributed systems
* [steelkiwi/cropiwa](https://github.com/steelkiwi/cropiwa) - 📐 Configurable Custom Crop widget for Android
* [MindorksOpenSource/android-developer-roadmap](https://github.com/MindorksOpenSource/android-developer-roadmap) - Android Developer Roadmap - A complete roadmap to learn Android App Development
* [camunda-cloud/zeebe](https://github.com/camunda-cloud/zeebe) - Distributed Workflow Engine for Microservices Orchestration
* [docker-java/docker-java](https://github.com/docker-java/docker-java) - Java Docker API Client
* [Yalantis/Horizon](https://github.com/Yalantis/Horizon) - Horizon - Simple visual equaliser for Android
* [hidroh/materialistic](https://github.com/hidroh/materialistic) - A material-design Hacker News Android reader
* [kubernetes-client/java](https://github.com/kubernetes-client/java) - Official Java client library for kubernetes
* [classgraph/classgraph](https://github.com/classgraph/classgraph) - An uber-fast parallelized Java classpath scanner and module scanner.
* [vipshop/Saturn](https://github.com/vipshop/Saturn) - The vip.com's distributed job scheduling platform.
* [AsamK/signal-cli](https://github.com/AsamK/signal-cli) - signal-cli provides an unofficial commandline and dbus interface for signalapp/libsignal-service-java
* [openzipkin/brave](https://github.com/openzipkin/brave) - Java distributed tracing implementation compatible with Zipkin backend services.
* [akexorcist/RoundCornerProgressBar](https://github.com/akexorcist/RoundCornerProgressBar) - [Android] Round Corner Progress Bar Library for Android
* [eclipsesource/J2V8](https://github.com/eclipsesource/J2V8) - Java Bindings for V8
* [internetarchive/heritrix3](https://github.com/internetarchive/heritrix3) - Heritrix is the Internet Archive's open-source, extensible, web-scale, archival-quality web crawler project.
* [ethereum/ethereumj](https://github.com/ethereum/ethereumj) - DEPRECATED! Java implementation of the Ethereum yellowpaper. For JSON-RPC and other client features check Ethereum Harmony
* [real-logic/agrona](https://github.com/real-logic/agrona) - High Performance data structures and utility methods for Java
* [rsocket/rsocket-java](https://github.com/rsocket/rsocket-java) - Java implementation of RSocket
* [pac4j/pac4j](https://github.com/pac4j/pac4j) - Security engine for Java (authentication, authorization, multi frameworks): OAuth, CAS, SAML, OpenID Connect, LDAP, JWT...
* [oracle/visualvm](https://github.com/oracle/visualvm) - VisualVM is an All-in-One Java Troubleshooting Tool
* [zeromq/jeromq](https://github.com/zeromq/jeromq) - Pure Java ZeroMQ
* [cymcsg/UltimateAndroid](https://github.com/cymcsg/UltimateAndroid) - UltimateAndroid is a rapid development framework for developing your apps
* [spotify/helios](https://github.com/spotify/helios) - Docker container orchestration platform
* [assertj/assertj-core](https://github.com/assertj/assertj-core) - AssertJ is a library providing easy to use rich typed assertions
* [PojavLauncherTeam/PojavLauncher](https://github.com/PojavLauncherTeam/PojavLauncher) - A Minecraft: Java Edition Launcher for Android and iOS based on Boardwalk. This repository contains source code for Android platform.
* [google/jimfs](https://github.com/google/jimfs) - An in-memory file system for Java 7+
* [searchbox-io/Jest](https://github.com/searchbox-io/Jest) - Elasticsearch Java Rest Client.
* [sofastack/sofa-bolt](https://github.com/sofastack/sofa-bolt) - SOFABolt is a lightweight, easy to use and high performance remoting framework based on Netty.
* [Muddz/StyleableToast](https://github.com/Muddz/StyleableToast) - [Moved to MavenCentral] An Android library that takes the standard toast to the next level with many styling options. Works on all Android versions.
* [soot-oss/soot](https://github.com/soot-oss/soot) - Soot - A Java optimization framework
* [hellokaton/30-seconds-of-java8](https://github.com/hellokaton/30-seconds-of-java8) - 30 seconds to collect useful Java 8 snippet.
* [apilayer/restcountries](https://github.com/apilayer/restcountries) - Get information about countries via a RESTful API
* [avjinder/Minimal-Todo](https://github.com/avjinder/Minimal-Todo) - Material To-Do App
* [dooboolab/react-native-iap](https://github.com/dooboolab/react-native-iap) - react-native native module for In App Purchase.
* [Froussios/Intro-To-RxJava](https://github.com/Froussios/Intro-To-RxJava) - An extensive tutorial on RxJava
* [egzosn/pay-java-parent](https://github.com/egzosn/pay-java-parent) - 第三方支付对接全能支付Java开发工具包.优雅的轻量级支付模块集成支付对接支付整合（微信,支付宝,银联,友店,富友,跨境支付paypal,payoneer(P卡派安盈)易极付）app,扫码,网页刷脸付刷卡付条码付转账服务商模式,微信分账,微信合单支付、支持多种支付类型多支付账户，支付与业务完全剥离，简单几行代码即可实现支付，简单快速完成支付模块的开发，可轻松嵌入到任何系统里 目前仅是一个开发工具包（即SDK），只提供简单Web实现，建议使用maven或gradle引用本项目即可使用本SDK提供的各种支付相关的功能
* [Ramotion/expanding-collection-android](https://github.com/Ramotion/expanding-collection-android) - :octocat: ExpandingCollection is a material design card peek/pop controller. Android UI Library made by @Ramotion
* [jeecgboot/jeecg](https://github.com/jeecgboot/jeecg) - JEECG是一款基于代码生成器的J2EE快速开发平台，开源界“小普元”超越传统商业企业级开发平台。引领新的开发模式(Online Coding模式(自定义表单) - > 代码生成器模式 - > 手工MERGE智能开发)， 可以帮助解决Java项目90%的重复工作，让开发更多关注业务逻辑。既能快速提高开发效率，帮助公司节省人力成本，同时又不失灵活性。具备：表单配置能力（无需编码）、移动配置能力、工作流配置能力、报表配置能力（支持移动端）、插件开发能力（可插拔）
* [hierynomus/sshj](https://github.com/hierynomus/sshj) - ssh, scp and sftp for java
* [apache/avro](https://github.com/apache/avro) - Apache Avro is a data serialization system.
* [huaban/jieba-analysis](https://github.com/huaban/jieba-analysis) - 结巴分词(java版)
* [TNG/ArchUnit](https://github.com/TNG/ArchUnit) - A Java architecture test library, to specify and assert architecture rules in plain Java
* [spring-projects/spring-batch](https://github.com/spring-projects/spring-batch) - Spring Batch is a framework for writing offline and batch applications using Spring and Java
* [AnySoftKeyboard/AnySoftKeyboard](https://github.com/AnySoftKeyboard/AnySoftKeyboard) - Android (f/w 2.1+) on screen keyboard for multiple languages (chat https://gitter.im/AnySoftKeyboard)
* [Ramotion/android-ui-animation-components-and-libraries](https://github.com/Ramotion/android-ui-animation-components-and-libraries) - Android UI libraries, components and animations by @ramotion
* [drewnoakes/metadata-extractor](https://github.com/drewnoakes/metadata-extractor) - Extracts Exif, IPTC, XMP, ICC and other metadata from image, video and audio files
* [speedment/speedment](https://github.com/speedment/speedment) - Speedment is a Stream ORM Java Toolkit and Runtime
* [gitblit/gitblit](https://github.com/gitblit/gitblit) - pure java git solution
* [apache/activemq](https://github.com/apache/activemq) - Mirror of Apache ActiveMQ
* [xerial/sqlite-jdbc](https://github.com/xerial/sqlite-jdbc) - SQLite JDBC Driver
* [bytedeco/javacpp-presets](https://github.com/bytedeco/javacpp-presets) - The missing Java distribution of native C++ libraries
* [ulisesbocchio/jasypt-spring-boot](https://github.com/ulisesbocchio/jasypt-spring-boot) - Jasypt integration for Spring boot
* [apache/mahout](https://github.com/apache/mahout) - Mirror of Apache Mahout
* [sarxos/webcam-capture](https://github.com/sarxos/webcam-capture) - The goal of this project is to allow integrated or USB-connected webcams to be accessed directly from Java. Using provided libraries users are able to read camera images and detect motion. Main project consist of several sub projects - the root one, which contains required classes, build-in webcam driver compatible with Windows, Linux and Mac OS, which can stream images as fast as your camera can serve them (up to 50 FPS). Main project can be used standalone, but user is able to replace build-in driver with different one - such as OpenIMAJ, GStreamer, V4L4j, JMF, LTI-CIVIL, FMJ, etc.
* [hamcrest/JavaHamcrest](https://github.com/hamcrest/JavaHamcrest) - Java (and original) version of Hamcrest
* [HelloWorld521/Java](https://github.com/HelloWorld521/Java) - java项目实战练习
* [Yalantis/StarWars.Android](https://github.com/Yalantis/StarWars.Android) - This component implements transition animation to crumble view into tiny pieces.
* [DozerMapper/dozer](https://github.com/DozerMapper/dozer) - Dozer is a Java Bean to Java Bean mapper that recursively copies data from one object to another.
* [BruceEckel/OnJava8-Examples](https://github.com/BruceEckel/OnJava8-Examples) - Code Examples for the book "On Java 8"
* [moquette-io/moquette](https://github.com/moquette-io/moquette) - Java MQTT lightweight broker
* [anitaa1990/Android-Cheat-sheet](https://github.com/anitaa1990/Android-Cheat-sheet) - Cheat Sheet for Android Interviews
* [ninjaframework/ninja](https://github.com/ninjaframework/ninja) - Ninja is a full stack web framework for Java. Rock solid, fast and super productive.
* [jOOQ/jOOL](https://github.com/jOOQ/jOOL) - jOOλ - The Missing Parts in Java 8 jOOλ improves the JDK libraries in areas where the Expert Group's focus was elsewhere. It adds tuple support, function support, and a lot of additional functionality around sequential Streams. The JDK 8's main efforts (default methods, lambdas, and the Stream API) were focused around maintaining backwards compatibility and implementing a functional API for parallelism.
* [airsonic/airsonic](https://github.com/airsonic/airsonic) -  :satellite: :cloud: :notes:Airsonic, a Free and Open Source community driven media server (fork of Subsonic and Libresonic)
* [liuyubobobo/Play-with-Data-Structures](https://github.com/liuyubobobo/Play-with-Data-Structures) - Codes of my MOOC Course <Play Data Structures in Java>. Updated contents and practices are also included. 我在慕课网上的课程《Java语言玩转数据结构》示例代码。课程的更多更新内容及辅助练习也将逐步添加进这个代码仓。
* [boylegu/SpringBoot-vue](https://github.com/boylegu/SpringBoot-vue) - A example demo base SpringBooot with vueJS2.x + webpack2.x as Java full stack web practice
* [TakahikoKawasaki/nv-websocket-client](https://github.com/TakahikoKawasaki/nv-websocket-client) - High-quality WebSocket client implementation in Java.
* [scalad/Note](https://github.com/scalad/Note) - 常规Java工具，算法，加密，数据库，面试题，源代码分析，解决方案
* [Ramotion/garland-view-android](https://github.com/Ramotion/garland-view-android) - :octocat: ≡ GarlandView seamlessly transitions between multiple lists of content. Made by @Ramotion
* [Yalantis/FlipViewPager.Draco](https://github.com/Yalantis/FlipViewPager.Draco) - This project aims to provide a working page flip implementation for usage in ListView.
* [dunwu/javacore](https://github.com/dunwu/javacore) - :coffee: JavaCore 是对 Java 核心技术的经验总结。
* [torakiki/pdfsam](https://github.com/torakiki/pdfsam) - PDFsam, a desktop application to extract pages, split, merge, mix and rotate PDF files
* [Athou/commafeed](https://github.com/Athou/commafeed) - Google Reader inspired self-hosted RSS reader.
* [uber/piranha](https://github.com/uber/piranha) - A tool for refactoring code related to feature flag APIs
* [shyiko/mysql-binlog-connector-java](https://github.com/shyiko/mysql-binlog-connector-java) - MySQL Binary Log connector
* [LogNet/grpc-spring-boot-starter](https://github.com/LogNet/grpc-spring-boot-starter) - Spring Boot starter module for gRPC  framework.
* [eclipse/eclipse-collections](https://github.com/eclipse/eclipse-collections) - Eclipse Collections is a collections framework for Java with optimized data structures and a rich, functional and fluent API.
* [konsoletyper/teavm](https://github.com/konsoletyper/teavm) - Compiler of Java bytecode to JavaScript
* [ysc/QuestionAnsweringSystem](https://github.com/ysc/QuestionAnsweringSystem) - QuestionAnsweringSystem是一个Java实现的人机问答系统，能够自动分析问题并给出候选答案。
* [airbnb/AirMapView](https://github.com/airbnb/AirMapView) - A view abstraction to provide a map user interface with various underlying map providers
* [syncthing/syncthing-android](https://github.com/syncthing/syncthing-android) - Wrapper of syncthing for Android.
* [bonigarcia/webdrivermanager](https://github.com/bonigarcia/webdrivermanager) - Automated driver management and Docker builder for Selenium WebDriver
* [zhegexiaohuozi/SeimiCrawler](https://github.com/zhegexiaohuozi/SeimiCrawler) - 一个简单、敏捷、分布式的支持SpringBoot的Java爬虫框架;An agile, distributed crawler framework.
* [Ramotion/circle-menu-android](https://github.com/Ramotion/circle-menu-android) - :octocat: ⭕️ CircleMenu is a simple, elegant UI menu with a circular layout and material design animations. Android UI library made by @Ramotion
* [qiujiayu/AutoLoadCache](https://github.com/qiujiayu/AutoLoadCache) -   AutoLoadCache 是基于AOP+Annotation等技术实现的高效的缓存管理解决方案，实现缓存与业务逻辑的解耦，并增加异步刷新及“拿来主义机制”，以适应高并发环境下的使用。
* [hekailiang/squirrel](https://github.com/hekailiang/squirrel) - squirrel-foundation is a State Machine library, which provided a lightweight, easy use, type safe and programmable state machine implementation for Java.
* [amaembo/streamex](https://github.com/amaembo/streamex) - Enhancing Java Stream API
* [qos-ch/slf4j](https://github.com/qos-ch/slf4j) - Simple Logging Facade for Java
* [OryxProject/oryx](https://github.com/OryxProject/oryx) - Oryx 2: Lambda architecture on Apache Spark, Apache Kafka for real-time large scale machine learning
* [xiaojieonly/Ehviewer_CN_SXJ](https://github.com/xiaojieonly/Ehviewer_CN_SXJ) - ehviewer，用爱发电，快乐前行
* [julian-klode/dns66](https://github.com/julian-klode/dns66) - DNS-based Host Blocker (and lightweight ad blocker) for Android
* [kanwangzjm/funiture](https://github.com/kanwangzjm/funiture) - 慕课网课程推荐 Java并发编程与高并发解决方案：http://coding.imooc.com/class/195.html Java开发企业级权限管理系统：http://coding.imooc.com/class/149.html github: https://github.com/kanwangzjm/funiture, spring项目，权限管理、系统监控、定时任务动态调整、qps限制、sql监控(邮件)、验证码服务、短链接服务、动态配置等
* [qdrzwd/VideoRecorder](https://github.com/qdrzwd/VideoRecorder) - android视频录制，模仿微视，支持按下录制、抬起暂停。进度条断点显示。
* [notnoop/java-apns](https://github.com/notnoop/java-apns) - Java Apple Push Notification Service Provider
* [a466350665/smart-sso](https://github.com/a466350665/smart-sso) - springboot SSO 单点登录，OAuth2实现，支持App登录，支持分布式
* [redsolution/xabber-android](https://github.com/redsolution/xabber-android) - Open-source XMPP client for Android
* [connectbot/connectbot](https://github.com/connectbot/connectbot) - ConnectBot is the first SSH client for Android.
* [buchen/portfolio](https://github.com/buchen/portfolio) - A simple tool to calculate the overall performance of an investment portfolio.
* [mabe02/lanterna](https://github.com/mabe02/lanterna) - Java library for creating text-based GUIs
* [zq2599/blog_demos](https://github.com/zq2599/blog_demos) - CSDN博客专家程序员欣宸的github，这里有五百多篇原创文章的详细分类和汇总，以及对应的源码，内容涉及Java、Docker、Kubernetes、DevOPS等方面
* [find-sec-bugs/find-sec-bugs](https://github.com/find-sec-bugs/find-sec-bugs) - The SpotBugs plugin for security audits of Java web applications and Android applications. (Also work with Kotlin, Groovy and Scala projects)
* [sanluan/PublicCMS](https://github.com/sanluan/PublicCMS) - 现代化java cms，由天津黑核科技有限公司开发，轻松支撑千万数据、千万PV；支持静态化，服务器端包含; 目前已经拥有全球0.0002%的用户，语言支持中、繁、日、英；是一个已走向海外的成熟CMS产品
* [apache/servicecomb-java-chassis](https://github.com/apache/servicecomb-java-chassis) - ServiceComb Java Chassis is a Software Development Kit (SDK) for rapid development of microservices in Java, providing service registration, service discovery, dynamic routing, and service management features
* [yaphone/itchat4j](https://github.com/yaphone/itchat4j) - itchat4j -- 用Java扩展个人微信号的能力
* [spring-cloud/spring-cloud-config](https://github.com/spring-cloud/spring-cloud-config) - External configuration (server and client) for Spring Cloud
* [HotswapProjects/HotswapAgent](https://github.com/HotswapProjects/HotswapAgent) - Java unlimited redefinition of classes at runtime.
* [protostuff/protostuff](https://github.com/protostuff/protostuff) - Java serialization library, proto compiler, code generator
* [mercyblitz/thinking-in-spring-boot-samples](https://github.com/mercyblitz/thinking-in-spring-boot-samples) - 小马哥书籍《Spring Boot 编程思想》示例工程
* [apache/iotdb](https://github.com/apache/iotdb) - Apache IoTDB
* [heinrichreimer/material-intro](https://github.com/heinrichreimer/material-intro) - A simple material design app intro with cool animations and a fluent API.
* [vaadin/framework](https://github.com/vaadin/framework) - Vaadin 6, 7, 8   is a Java framework for modern Java web applications.
* [liuguangqiang/SwipeBack](https://github.com/liuguangqiang/SwipeBack) - SwipeBack is an android library that can finish a activity by using gesture.
* [CarpenterLee/JavaLambdaInternals](https://github.com/CarpenterLee/JavaLambdaInternals) - 深入理解Java函数式编程和Streams API
* [marytts/marytts](https://github.com/marytts/marytts) - MARY TTS -- an open-source, multilingual text-to-speech synthesis system written in pure java
* [plutext/docx4j](https://github.com/plutext/docx4j) - JAXB-based Java library for Word docx, Powerpoint pptx, and Excel xlsx files
* [cbeust/testng](https://github.com/cbeust/testng) - TestNG testing framework
* [doublechaintech/scm-biz-suite](https://github.com/doublechaintech/scm-biz-suite) - 供应链中台系统基础版，集成零售管理, 电子商务, 供应链管理,  财务管理, 车队管理, 仓库管理, 人员管理, 产品管理, 订单管理, 会员管理, 连锁店管理, 加盟管理, 前端React/Ant Design, 后端Java Spring+自有开源框架，全面支持MySQL, PostgreSQL, 全面支持国产数据库南大通用GBase 8s,通过REST接口调用，前后端完全分离。
* [roncoo/spring-boot-demo](https://github.com/roncoo/spring-boot-demo) - Spring Boot的基础教程，由浅入深，一步一步学习Spring Boot，最后学到的不单单是基础！Spring Cloud基础教程请看：https://github.com/roncoo/spring-cloud-demo
* [commonmark/commonmark-java](https://github.com/commonmark/commonmark-java) - Java library for parsing and rendering CommonMark (Markdown)
* [cbeust/jcommander](https://github.com/cbeust/jcommander) - Command line parsing framework for Java
* [vsch/flexmark-java](https://github.com/vsch/flexmark-java) - CommonMark/Markdown Java parser with source level AST. CommonMark 0.28, emulation of: pegdown, kramdown, markdown.pl, MultiMarkdown. With HTML to MD, MD to PDF, MD to DOCX  conversion modules.
* [signalapp/libsignal-protocol-java](https://github.com/signalapp/libsignal-protocol-java) - Signal Protocol library for Java/Android
* [EsotericSoftware/kryonet](https://github.com/EsotericSoftware/kryonet) -  TCP/UDP client/server library for Java, based on Kryo
* [alibaba/jvm-sandbox-repeater](https://github.com/alibaba/jvm-sandbox-repeater) -  A Java server-side recording and playback solution based on JVM-Sandbox
* [kilim/kilim](https://github.com/kilim/kilim) - Lightweight threads for Java, with message passing, nio, http and scheduling support.
* [Yalantis/Taurus](https://github.com/Yalantis/Taurus) - A little more fun for the pull-to-refresh interaction.
* [stagemonitor/stagemonitor](https://github.com/stagemonitor/stagemonitor) - an open source solution to application performance monitoring for java server applications
* [jphp-group/jphp](https://github.com/jphp-group/jphp) - JPHP - an implementation of PHP on Java VM
* [eschao/android-PageFlip](https://github.com/eschao/android-PageFlip) - 3D Style Page Flip on Android
* [acmenlt/dynamic-threadpool](https://github.com/acmenlt/dynamic-threadpool) - 🔥 强大的动态线程池，附带监控报警功能（没有依赖中间件），完全遵循阿里巴巴编码规范。Powerful dynamic thread pool, does not rely on any middleware, with monitoring and alarm function.
* [flyingsaucerproject/flyingsaucer](https://github.com/flyingsaucerproject/flyingsaucer) - XML/XHTML and CSS 2.1 renderer in pure Java
* [RichardWarburton/java-8-lambdas-exercises](https://github.com/RichardWarburton/java-8-lambdas-exercises) - Exercises and Answers for Java 8 Lambdas book
* [klinker24/talon-twitter-holo](https://github.com/klinker24/talon-twitter-holo) - [Deprecated] The Holo version of my popular Android Talon for Twitter app, 100% open-source
* [prometheus/client_java](https://github.com/prometheus/client_java) - Prometheus instrumentation library for JVM applications
* [FreeTymeKiyan/LeetCode-Sol-Res](https://github.com/FreeTymeKiyan/LeetCode-Sol-Res) - Clean, Understandable Solutions and Resources for LeetCode Online Judge Algorithm Problems.
* [flutter/flutter-intellij](https://github.com/flutter/flutter-intellij) - Flutter Plugin for IntelliJ
* [KikiLetGo/VirusBroadcast](https://github.com/KikiLetGo/VirusBroadcast) - A java virus broadcast simulation
* [xuxueli/xxl-sso](https://github.com/xuxueli/xxl-sso) - A distributed single-sign-on framework.（分布式单点登录框架XXL-SSO）
* [ZHENFENG13/ssm-demo](https://github.com/ZHENFENG13/ssm-demo) - :banana:Spring+SpringMVC+Mybatis+easyUI实现简单的后台管理系统
* [ysc/word](https://github.com/ysc/word) - Java分布式中文分词组件 - word分词
* [eclipse/paho.mqtt.java](https://github.com/eclipse/paho.mqtt.java) - Eclipse Paho Java MQTT client library.  Paho is an Eclipse IoT project.
* [spotify/apollo](https://github.com/spotify/apollo) - Java libraries for writing composable microservices
* [kairosdb/kairosdb](https://github.com/kairosdb/kairosdb) - Fast scalable time series database
* [jberkel/sms-backup-plus](https://github.com/jberkel/sms-backup-plus) - Backup Android SMS, MMS and call log to Gmail / Gcal / IMAP
* [tlaplus/tlaplus](https://github.com/tlaplus/tlaplus) - TLC is an explicit state model checker for specifications written in TLA+. The TLA+Toolbox is an IDE for TLA+.
* [threedr3am/learnjavabug](https://github.com/threedr3am/learnjavabug) - Java安全相关的漏洞和技术demo，原生Java、Fastjson、Jackson、Hessian2、XML反序列化漏洞利用和Spring、Dubbo、Shiro、CAS、Tomcat、RMI、Nexus等框架\中间件\功能的exploits以及Java Security Manager绕过、Dubbo-Hessian2安全加固等等实践代码。
* [apache/drill](https://github.com/apache/drill) - Apache Drill is a distributed MPP query layer for self describing data
* [pf4j/pf4j](https://github.com/pf4j/pf4j) - Plugin Framework for Java (PF4J)
* [JeffLi1993/java-core-learning-example](https://github.com/JeffLi1993/java-core-learning-example) - 关于Java核心技术学习积累的例子，是初学者及核心技术巩固的最佳实践。
* [pedroSG94/rtmp-rtsp-stream-client-java](https://github.com/pedroSG94/rtmp-rtsp-stream-client-java) - Library to stream in rtmp and rtsp for Android. All code in Java
* [opentracing/opentracing-java](https://github.com/opentracing/opentracing-java) - OpenTracing API for Java
* [bravoborja/ReadMoreTextView](https://github.com/bravoborja/ReadMoreTextView) - A Custom TextView with trim text
* [googleapis/google-cloud-java](https://github.com/googleapis/google-cloud-java) - Google Cloud Client Library for Java
* [openhab/openhab-addons](https://github.com/openhab/openhab-addons) - Add-ons for openHAB
* [UweTrottmann/SeriesGuide](https://github.com/UweTrottmann/SeriesGuide) - Track your favorite TV shows and movies on Android devices.
* [GoogleLLP/SuperMarket](https://github.com/GoogleLLP/SuperMarket) - 设计精良的网上商城系统，包括前端、后端、数据库、负载均衡、数据库缓存、分库分表、读写分离、全文检索、消息队列等，使用SpringCloud框架，基于Java开发。该项目可部署到服务器上，不断完善中……
* [indy256/codelibrary](https://github.com/indy256/codelibrary) - :gem:Collection of algorithms and data structures
* [coderbruis/JavaSourceCodeLearning](https://github.com/coderbruis/JavaSourceCodeLearning) - Java流行框架源码分析：Spring源码、SpringBoot源码、SpringAOP源码、SpringSecurity源码、SpringSecurity OAuth2源码、JDK源码、Netty源码
* [bcgit/bc-java](https://github.com/bcgit/bc-java) - Bouncy Castle Java Distribution (Mirror)
* [casbin/jcasbin](https://github.com/casbin/jcasbin) - An authorization library that supports access control models like ACL, RBAC, ABAC in Java
* [jdbi/jdbi](https://github.com/jdbi/jdbi) - jdbi is designed to provide convenient tabular data access in Java; including templated SQL, parameterized and strongly typed queries, and Streams integration
* [aNNiMON/Lightweight-Stream-API](https://github.com/aNNiMON/Lightweight-Stream-API) - Stream API from Java 8 rewritten on iterators for Java 7 and below
* [Yalantis/ToDoList](https://github.com/Yalantis/ToDoList) - Micro-Transitions for Smooth Android To-Do List Animations
* [javahongxi/whatsmars](https://github.com/javahongxi/whatsmars) - Java生态研究(Spring Boot + Redis + Dubbo + RocketMQ + Elasticsearch)🔥🔥🔥🔥🔥
* [p6spy/p6spy](https://github.com/p6spy/p6spy) - P6Spy is a framework that enables database data to be seamlessly intercepted and logged with no code changes to the application.
* [apache/ambari](https://github.com/apache/ambari) - Mirror of Apache Ambari
* [rapidoid/rapidoid](https://github.com/rapidoid/rapidoid) - Rapidoid - Extremely Fast, Simple and Powerful Java Web Framework and HTTP Server!
* [vran-dev/PrettyZoo](https://github.com/vran-dev/PrettyZoo) - 😉    Pretty nice Zookeeper GUI, Support Win / Mac / Linux Platform
* [majidgolshadi/Android-Download-Manager-Pro](https://github.com/majidgolshadi/Android-Download-Manager-Pro) - Android/Java download manager library help you to download files in parallel mechanism in some chunks.
* [shekhargulati/java8-the-missing-tutorial](https://github.com/shekhargulati/java8-the-missing-tutorial) - Java 8 for all of us
* [jayZheng87/Thusy](https://github.com/jayZheng87/Thusy) - Java 工具类库；在全面集成 Hutool 上进行工具类二次收集的一个类库
* [apache/pdfbox](https://github.com/apache/pdfbox) - Mirror of Apache PDFBox
* [j256/ormlite-android](https://github.com/j256/ormlite-android) - ORMLite Android functionality used in conjunction with ormlite-core
* [Smith-Cruise/Spring-Boot-Shiro](https://github.com/Smith-Cruise/Spring-Boot-Shiro) - Shiro基于SpringBoot +JWT搭建简单的restful服务
* [uber-common/jvm-profiler](https://github.com/uber-common/jvm-profiler) - JVM Profiler Sending Metrics to Kafka, Console Output or Custom Reporter
* [JorenSix/TarsosDSP](https://github.com/JorenSix/TarsosDSP) - A Real-Time Audio Processing Framework in Java
* [xianrendzw/EasyReport](https://github.com/xianrendzw/EasyReport) - A simple and easy to use Web Report System for java.EasyReport是一个简单易用的Web报表工具(支持Hadoop,HBase及各种关系型数据库),它的主要功能是把SQL语句查询出的行列结构转换成HTML表格(Table)，并支持表格的跨行(RowSpan)与跨列(ColSpan)。同时它还支持报表Excel导出、图表显示及固定表头与左边列的功能。
* [nayuki/Project-Euler-solutions](https://github.com/nayuki/Project-Euler-solutions) - Runnable code for solving Project Euler problems in Java, Python, Mathematica, Haskell.
* [Netflix/genie](https://github.com/Netflix/genie) - Distributed Big Data Orchestration Service
* [asLody/legend](https://github.com/asLody/legend) - A framework for hook java methods.
* [fabric8io/docker-maven-plugin](https://github.com/fabric8io/docker-maven-plugin) - Maven plugin for running and creating Docker images
* [GlowstoneMC/Glowstone](https://github.com/GlowstoneMC/Glowstone) - A fast, customizable and compatible open source server for Minecraft: Java Edition
* [spring-cloud/spring-cloud-sleuth](https://github.com/spring-cloud/spring-cloud-sleuth) - Distributed tracing for spring cloud
* [asciidocfx/AsciidocFX](https://github.com/asciidocfx/AsciidocFX) - Asciidoc Editor and Toolchain written with JavaFX 16 (Build PDF, Epub, Mobi and HTML books, documents and slides)
* [springdoc/springdoc-openapi](https://github.com/springdoc/springdoc-openapi) - Library for OpenAPI 3 with spring-boot
* [MorphiaOrg/morphia](https://github.com/MorphiaOrg/morphia) - MongoDB object-document mapper in Java based on https://github.com/mongodb/mongo-java-driver
* [cachecats/coderiver](https://github.com/cachecats/coderiver) -  致力于打造全平台全栈精品开源项目，计划做成包含  pc 端（Vue、React）、移动 H5（Vue、React）、ReactNative、Flutter、Android 原生、微信小程序、Angular、Node、java 后端的全平台型全栈项目，欢迎关注。
* [UniversalMediaServer/UniversalMediaServer](https://github.com/UniversalMediaServer/UniversalMediaServer) - A DLNA, UPnP and HTTP(S) Media Server.
* [SundeepK/CompactCalendarView](https://github.com/SundeepK/CompactCalendarView) - An android library which provides a compact calendar view much like the one used in google calenders.
* [googlemaps/google-maps-services-java](https://github.com/googlemaps/google-maps-services-java) - Java client library for Google Maps API Web Services
* [youseries/ureport](https://github.com/youseries/ureport) - UReport2 is a high-performance pure Java report engine based on Spring architecture, where complex Chinese-style statements and reports can be prepared by iterating over cells.
* [jdeferred/jdeferred](https://github.com/jdeferred/jdeferred) - Java Deferred/Promise library similar to JQuery.
* [dcevm/dcevm](https://github.com/dcevm/dcevm) - Dynamic Code Evolution VM for Java 7/8
* [Joolun/JooLun-wx](https://github.com/Joolun/JooLun-wx) - JooLun微信商城，Java + SpringBoot + Maven + Swagger + Mybatis Plus + Redis + Vue + elementUI，微信公众号开发、小程序商城、微信支付、订单管理；商业版还有微服务、多租户Sass、Uniapp商城、小程序直播、多规格SKU、拼团、砍价、商户管理、 秒杀、优惠券、积分、多店铺、商城拖拽装修、服务商收款等功能
* [functionaljava/functionaljava](https://github.com/functionaljava/functionaljava) - Functional programming in Java
* [mendhak/gpslogger](https://github.com/mendhak/gpslogger) - :satellite: Lightweight GPS Logging Application For Android.
* [binarywang/weixin-java-mp-demo](https://github.com/binarywang/weixin-java-mp-demo) - 基于Spring Boot 和 WxJava 实现的微信公众号Java后端Demo，支持多公众号
* [wangjiegulu/WheelView](https://github.com/wangjiegulu/WheelView) - Android滚动选择控件
* [crossbario/autobahn-java](https://github.com/crossbario/autobahn-java) - WebSocket & WAMP in Java for Android and Java 8
* [jchambers/pushy](https://github.com/jchambers/pushy) - A Java library for sending APNs (iOS/macOS/Safari) push notifications
* [java-json-tools/json-schema-validator](https://github.com/java-json-tools/json-schema-validator) - A JSON Schema validation implementation in pure Java, which aims for correctness and performance, in that order
* [qiujuer/ImageBlurring](https://github.com/qiujuer/ImageBlurring) - Android blurring image(bitmap) by java and jni.
* [happyfish100/fastdfs-client-java](https://github.com/happyfish100/fastdfs-client-java) - FastDFS java client SDK
* [apache/bookkeeper](https://github.com/apache/bookkeeper) - Apache Bookkeeper
* [4thline/cling](https://github.com/4thline/cling) - UPnP/DLNA library for Java and Android
* [selenide/selenide](https://github.com/selenide/selenide) - Concise UI Tests with Java!
* [npgall/cqengine](https://github.com/npgall/cqengine) - Ultra-fast SQL-like queries on Java collections
* [Yalantis/pull-to-make-soup](https://github.com/Yalantis/pull-to-make-soup) - Custom animated pull-to-refresh that can be easily added to RecyclerView
* [apache/parquet-mr](https://github.com/apache/parquet-mr) - Apache Parquet
* [vladmihalcea/hibernate-types](https://github.com/vladmihalcea/hibernate-types) - The Hibernate Types library gives you extra types that are not supported by the Hibernate ORM core.
* [mmin18/FlexLayout](https://github.com/mmin18/FlexLayout) - A powerful Android layout view that use java expression in layout params to describe relative positions.
* [anvil-ui/anvil](https://github.com/anvil-ui/anvil) - Minimal UI library for Android inspired by React
* [SeldonIO/seldon-server](https://github.com/SeldonIO/seldon-server) - Machine Learning Platform and Recommendation Engine built on Kubernetes
* [fengjiachun/Jupiter](https://github.com/fengjiachun/Jupiter) - Jupiter是一款性能非常不错的, 轻量级的分布式服务框架
* [mercyblitz/segmentfault-lessons](https://github.com/mercyblitz/segmentfault-lessons) - Segment Fault 在线讲堂 代码工程
* [waylau/netty-4-user-guide-demos](https://github.com/waylau/netty-4-user-guide-demos) - Netty demos. （Netty 案例大全）
* [RuedigerMoeller/fast-serialization](https://github.com/RuedigerMoeller/fast-serialization) - FST: fast java serialization drop in-replacement
* [yahoo/mysql_perf_analyzer](https://github.com/yahoo/mysql_perf_analyzer) - MySQL performance monitoring and analysis.
* [jooby-project/jooby](https://github.com/jooby-project/jooby) - The modular web framework for Java and Kotlin
* [spotify/docker-client](https://github.com/spotify/docker-client) - INACTIVE: A simple docker client for the JVM
* [netgloo/spring-boot-samples](https://github.com/netgloo/spring-boot-samples) - Spring Boot samples by Netgloo
* [iqiyi/Qigsaw](https://github.com/iqiyi/Qigsaw) - 🔥🔥Qigsaw ['tʃɪɡsɔ] is a dynamic modularization library which is based on Android App Bundles(Do not need Google Play Service). It supports dynamic delivery for split APKs without reinstalling the base one.
* [galenframework/galen](https://github.com/galenframework/galen) - Layout and functional testing framework for websites
* [sleuthkit/autopsy](https://github.com/sleuthkit/autopsy) - Autopsy® is a digital forensics platform and graphical interface to The Sleuth Kit® and other digital forensics tools. It can be used by law enforcement, military, and corporate examiners to investigate what happened on a computer. You can even use it to recover photos from your camera's memory card.
* [erupts/erupt](https://github.com/erupts/erupt) - 🚀 纯 Java 注解，单个类文件，快速开发 Admin 管理后台。不生成任何代码、零前端代码、零 CURD、自动建表、注解式API、自定义服务逻辑，支持所有主流数据库，支持自定义页面，支持多数据源，提供二十几类业务组件，十几种展示形式，支持逻辑删除，动态定时任务，前端后端分离等。核心技术：Spring Boot、JPA、Reflect、TypeScript、NG-ZORRO等。 开源不易，记得右上角点个star鼓励作者~
* [JonathanLink/PDFLayoutTextStripper](https://github.com/JonathanLink/PDFLayoutTextStripper) - Converts a pdf file into a text file while keeping the layout of the original pdf. Useful to extract the content from a table in a pdf file for instance. This is a subclass of PDFTextStripper class (from the Apache PDFBox library).
* [hapifhir/hapi-fhir](https://github.com/hapifhir/hapi-fhir) - 🔥 HAPI FHIR - Java API for HL7 FHIR Clients and Servers
* [youseries/urule](https://github.com/youseries/urule) - URULE是一款基于RETE算法的纯Java规则引擎，提供规则集、决策表、决策树、评分卡，规则流等各种规则表现工具及基于网页的可视化设计器，可快速开发出各种复杂业务规则。
* [yzcheng90/X-SpringBoot](https://github.com/yzcheng90/X-SpringBoot) - X-SpringBoot是一个轻量级的Java快速开发平台，能快速开发项目并交付【接私活利器】
* [spring-projects/spring-data-redis](https://github.com/spring-projects/spring-data-redis) - Provides support to increase developer productivity in Java when using Redis, a key-value store. Uses familiar Spring concepts such as a template classes for core API usage and lightweight repository style data access.
* [tobato/FastDFS_Client](https://github.com/tobato/FastDFS_Client) - Java Client for FastDFS
* [square/haha](https://github.com/square/haha) - DEPRECATED Java library to automate the analysis of Android heap dumps.
* [centic9/jgit-cookbook](https://github.com/centic9/jgit-cookbook) - Provides examples and code snippets for the JGit Java Git implementation
* [GoogleCloudPlatform/java-docs-samples](https://github.com/GoogleCloudPlatform/java-docs-samples) - Java and Kotlin Code samples used on cloud.google.com
* [JoyChou93/java-sec-code](https://github.com/JoyChou93/java-sec-code) - Java web common vulnerabilities and security code which is base on springboot and spring security
* [aimacode/aima-java](https://github.com/aimacode/aima-java) - Java implementation of algorithms from Russell And Norvig's "Artificial Intelligence - A Modern Approach"
* [OpenHFT/Java-Thread-Affinity](https://github.com/OpenHFT/Java-Thread-Affinity) - Bind a java thread to a given core
* [tomoya92/pybbs](https://github.com/tomoya92/pybbs) - 更实用的Java开发的社区(论坛)，Better use of Java development community (forum)
* [haraldk/TwelveMonkeys](https://github.com/haraldk/TwelveMonkeys) - TwelveMonkeys ImageIO: Additional plug-ins and extensions for Java's ImageIO
* [lilishop/lilishop](https://github.com/lilishop/lilishop) - 电商商城 开源商城 java电商商城系统 多用户商城
* [Docile-Alligator/Infinity-For-Reddit](https://github.com/Docile-Alligator/Infinity-For-Reddit) - A Reddit client for Android
* [json-iterator/java](https://github.com/json-iterator/java) - jsoniter (json-iterator) is fast and flexible JSON parser available in Java and Go
* [i2p/i2p.i2p](https://github.com/i2p/i2p.i2p) - I2P is an anonymizing network, offering a simple layer that identity-sensitive applications can use to securely communicate. All data is wrapped with several layers of encryption, and the network is both distributed and dynamic, with no trusted parties.
* [Haleydu/Cimoc](https://github.com/Haleydu/Cimoc) - 漫画阅读器
* [shekhargulati/strman-java](https://github.com/shekhargulati/strman-java) - A Java 8 string manipulation library.
* [88250/symphony](https://github.com/88250/symphony) - 🎶 一款用 Java 实现的现代化社区（论坛/问答/BBS/社交网络/博客）系统平台。A modern community (forum/Q&A/BBS/SNS/blog) system platform implemented in Java. https://ld246.com
* [winder/Universal-G-Code-Sender](https://github.com/winder/Universal-G-Code-Sender) - A cross-platform G-Code sender for GRBL, Smoothieware, TinyG and G2core.
* [bootique/bootique](https://github.com/bootique/bootique) - Bootique is a minimally opinionated platform for modern runnable Java apps.
* [0Chencc/CTFCrackTools](https://github.com/0Chencc/CTFCrackTools) - China's first CTFTools framework.中国国内首个CTF工具框架,旨在帮助CTFer快速攻克难关
* [dain/leveldb](https://github.com/dain/leveldb) - Port of LevelDB to Java
* [spring-projects/spring-data-mongodb](https://github.com/spring-projects/spring-data-mongodb) - Provide support to increase developer productivity in Java when using MongoDB. Uses familiar Spring concepts such as a template classes for core API usage and lightweight repository style data access.
* [CoderLeixiaoshuai/java-eight-part](https://github.com/CoderLeixiaoshuai/java-eight-part) - 『Java八股文』Java面试套路，Java进阶学习，打破内卷拿大厂Offer，升职加薪！
* [greenrobot/essentials](https://github.com/greenrobot/essentials) - General purpose utilities and hash functions for Android and Java (aka java-common)
* [albertlatacz/java-repl](https://github.com/albertlatacz/java-repl) - Read Eval Print Loop for Java
* [NLPchina/nlp-lang](https://github.com/NLPchina/nlp-lang) - 这个项目是一个基本包.封装了大多数nlp项目中常用工具
* [komoot/photon](https://github.com/komoot/photon) - an open source geocoder for openstreetmap data
* [kenglxn/QRGen](https://github.com/kenglxn/QRGen) - a simple QRCode generation api for java built on top ZXING
* [google/flogger](https://github.com/google/flogger) - A Fluent Logging API for Java
* [hcoles/pitest](https://github.com/hcoles/pitest) - State of the art mutation testing system for the JVM
* [graphhopper/jsprit](https://github.com/graphhopper/jsprit) - jsprit is a java based, open source toolkit for solving rich vehicle routing problems
* [mitreid-connect/OpenID-Connect-Java-Spring-Server](https://github.com/mitreid-connect/OpenID-Connect-Java-Spring-Server) - An OpenID Connect reference implementation in Java on the Spring platform.
* [vladimir-bukhtoyarov/bucket4j](https://github.com/vladimir-bukhtoyarov/bucket4j) - Java rate limiting library based on token/leaky-bucket algorithm.
* [vigna/fastutil](https://github.com/vigna/fastutil) - fastutil extends the Java™ Collections Framework by providing type-specific maps, sets, lists and queues.
* [JackJiang2011/beautyeye](https://github.com/JackJiang2011/beautyeye) - BeautyEye is a Java Swing cross-platform look and feel.
* [OysterQAQ/Pixiv-Illustration-Collection-Backend](https://github.com/OysterQAQ/Pixiv-Illustration-Collection-Backend) - pixivic Backend
* [danfickle/openhtmltopdf](https://github.com/danfickle/openhtmltopdf) - An HTML to PDF library for the JVM. Based on Flying Saucer and Apache PDF-BOX 2. With SVG image support. Now also with accessible PDF support (WCAG, Section 508, PDF/UA)!
* [apache/poi](https://github.com/apache/poi) - Mirror of Apache POI
* [gravitee-io/gravitee-api-management](https://github.com/gravitee-io/gravitee-api-management) - Gravitee.io - OpenSource API Management
* [Discord4J/Discord4J](https://github.com/Discord4J/Discord4J) - Discord4J is a fast, powerful, unopinionated, reactive library to enable quick and easy development of Discord bots for Java, Kotlin, and other JVM languages using the official Discord Bot API.
* [aws/aws-sdk-java-v2](https://github.com/aws/aws-sdk-java-v2) - The official AWS SDK for Java - Version 2
* [itext/itextpdf](https://github.com/itext/itextpdf) - [DEPRECATED] Core Java Library + PDF/A, xtra and XML Worker. Only security fixes will be added — please use iText 7
* [tabulapdf/tabula-java](https://github.com/tabulapdf/tabula-java) - Extract tables from PDF files
* [jwpttcg66/NettyGameServer](https://github.com/jwpttcg66/NettyGameServer) - 使用netty4.X实现的手机游戏分布式服务器,支持tcp,udp,http,websocket链接，采用protobuf自定义协议栈进行网络通信,支持rpc远程调用,使用mybatis3支持db存储分库分表，支持异步mysql存储，db保存时同步更新reids缓存。 使用ExcelToCode工程，将excel数据生成java类和json数据字典，DictService直接读取json，减少数据字典部分代码。使用game-executor工程，增加游戏内的异步事件全局服务, 支持事件sharding,均衡的异步执行事件逻辑
* [Pi4J/pi4j-v1](https://github.com/Pi4J/pi4j-v1) - Java I/O library for Raspberry Pi (GPIO, I2C, SPI, UART)
* [mixi-inc/AndroidTraining](https://github.com/mixi-inc/AndroidTraining) - Training course repository for android app development
* [linisme/Cipher.so](https://github.com/linisme/Cipher.so) - A simple way to encrypt your secure data like passwords into a native .so library.
* [apache/maven-mvnd](https://github.com/apache/maven-mvnd) - Apache Maven Daemon
* [blipinsk/RecyclerViewHeader](https://github.com/blipinsk/RecyclerViewHeader) - [DEPRECATED] Super fast and easy way to create header for Android RecyclerView
* [cmusphinx/sphinx4](https://github.com/cmusphinx/sphinx4) - Pure Java speech recognition library
* [apache/tika](https://github.com/apache/tika) - The Apache Tika toolkit detects and extracts metadata and text from over a thousand different file types (such as PPT, XLS, and PDF).
* [jingle1267/android-utils](https://github.com/jingle1267/android-utils) - It contains most of the Android utility classes.
* [mattia-battiston/clean-architecture-example](https://github.com/mattia-battiston/clean-architecture-example) - Clean Architecture Example (Java): Example of what clean architecture would look like (in Java)
* [Instagram/ig-json-parser](https://github.com/Instagram/ig-json-parser) - Fast JSON parser for java projects
* [magefree/mage](https://github.com/magefree/mage) - Magic Another Game Engine
* [FlowCI/flow-core-x](https://github.com/FlowCI/flow-core-x) - Powerful and user-friendly CI / CD server with high availability, parallel build, agent scaling
* [kalessil/phpinspectionsea](https://github.com/kalessil/phpinspectionsea) - A Static Code Analyzer for PHP (a PhpStorm/Idea Plugin)
* [sirthias/pegdown](https://github.com/sirthias/pegdown) - A pure-Java Markdown processor based on a parboiled PEG parser supporting a number of extensions
* [survivingwithandroid/Surviving-with-android](https://github.com/survivingwithandroid/Surviving-with-android) - Source code related to the posts in the blog
* [EsotericSoftware/reflectasm](https://github.com/EsotericSoftware/reflectasm) - High performance Java reflection
* [ta4j/ta4j](https://github.com/ta4j/ta4j) - A Java library for technical analysis.
* [hawtio/hawtio](https://github.com/hawtio/hawtio) - Hawtio web console helps you manage your JVM stuff and stay cool!
* [jknack/handlebars.java](https://github.com/jknack/handlebars.java) - Logic-less and semantic Mustache templates with Java
* [ebean-orm/ebean](https://github.com/ebean-orm/ebean) - Ebean ORM
* [INRIA/spoon](https://github.com/INRIA/spoon) - Spoon is a metaprogramming library to analyze and transform Java source code. :spoon: is made with :heart:, :beers: and :sparkles:. It parses source files to build a well-designed AST with powerful analysis and transformation API.
* [mpetazzoni/ttorrent](https://github.com/mpetazzoni/ttorrent) - BitTorrent Java library with tracker and download client
* [Dreampie/Resty](https://github.com/Dreampie/Resty) - The minimalist framework of RESTful(server and client) - Resty
* [openjdk/loom](https://github.com/openjdk/loom) - https://openjdk.java.net/projects/loom/
* [aliyun/aliyun-openapi-java-sdk](https://github.com/aliyun/aliyun-openapi-java-sdk) - Alibaba Cloud SDK for Java
* [RaiMan/SikuliX1](https://github.com/RaiMan/SikuliX1) - SikuliX version 2.0.0+ (2019+)
* [864381832/xJavaFxTool](https://github.com/864381832/xJavaFxTool) - 基于JavaFx搭建的实用小工具集合，方便开发过程中的代码编写与调试，想学习javaFx的同学可以参考参考。其中包括文件复制、Cron表达式生成器、编码转换、加密解密、Time转换、路径转换、二维码生成工具、身份证生成器、正则表达式生成工具、网址缩短、转义字符、字符串转换、Mq调试工具、Http调试工具、json格式化编辑工具、图标生成工具、Redis连接工具、网页源码下载工具、切换Hosts工具、Ftp服务器、Cmd调试工具、Ftp/Ftps/Sftp客户端调试工具、Pdf转换工具、文件列表生成器、图片压缩工具、图片转码工具、Kafka调试工具、Email群发工具、颜色代码转换工具、短信群发工具、脚本引擎调试、文件重命名、Json转换、语音转换、Socket调试、图片解析、微信小程序反编译、Zookeeper操作、Excel拆分合并、文件夹监控、文件编码检测、传输、端口扫描、久坐提醒、随机数生成、剪贴板历史、文件搜索、mp3转换、印章生成等工具
* [iTXTech/Daedalus](https://github.com/iTXTech/Daedalus) - No root required Android DNS modifier and Hosts/DNSMasq resolver.
* [BuildCraft/BuildCraft](https://github.com/BuildCraft/BuildCraft) - BuildCraft
* [EssentialsX/Essentials](https://github.com/EssentialsX/Essentials) - The essential plugin suite for Minecraft servers.
* [spring-projects/spring-data-book](https://github.com/spring-projects/spring-data-book) - Spring Data - The Definitive Guide - Modern Data Access for Enterprise Java Developers
* [cincheo/jsweet](https://github.com/cincheo/jsweet) - A Java to JavaScript transpiler.
* [LeonardoZ/java-concurrency-patterns](https://github.com/LeonardoZ/java-concurrency-patterns) - Concurrency Patterns and features found in Java, through multithreaded programming. Threads, Locks, Atomics and more.
* [msgpack/msgpack-java](https://github.com/msgpack/msgpack-java) - MessagePack serializer implementation for Java / msgpack.org[Java]
* [hellokaton/learn-java8](https://github.com/hellokaton/learn-java8) - 💖《跟上 Java 8》视频课程源码
* [atduskgreg/opencv-processing](https://github.com/atduskgreg/opencv-processing) - OpenCV for Processing. A creative coding computer vision library based on the official OpenCV Java API
* [spring-projects/spring-integration](https://github.com/spring-projects/spring-integration) - Spring Integration provides an extension of the Spring programming model to support the well-known Enterprise Integration Patterns (EIP)
* [datastax/java-driver](https://github.com/datastax/java-driver) - DataStax Java Driver for Apache Cassandra
* [locationtech/jts](https://github.com/locationtech/jts) - The JTS Topology Suite is a Java library for creating and manipulating vector geometry.
* [geotools/geotools](https://github.com/geotools/geotools) - Official GeoTools repository
* [cuba-platform/cuba](https://github.com/cuba-platform/cuba) - CUBA Platform is a high level framework for enterprise applications development
* [flipkart-incubator/proteus](https://github.com/flipkart-incubator/proteus) - Proteus : A JSON based LayoutInflater for Android
* [srikanth-lingala/zip4j](https://github.com/srikanth-lingala/zip4j) - A Java library for zip files and streams
* [spring-projects/spring-statemachine](https://github.com/spring-projects/spring-statemachine) - Spring Statemachine is a framework for application developers to use state machine concepts with Spring.
* [electronicarts/ea-async](https://github.com/electronicarts/ea-async) - EA Async implements async-await methods in the JVM.
* [ivan-vasilev/neuralnetworks](https://github.com/ivan-vasilev/neuralnetworks) - java deep learning algorithms and deep neural networks with gpu acceleration
* [j-easy/easy-random](https://github.com/j-easy/easy-random) - The simple, stupid random Java beans/records generator
* [knowm/XChart](https://github.com/knowm/XChart) - XChart is a light-weight Java library for plotting data.
* [kwhat/jnativehook](https://github.com/kwhat/jnativehook) - Global keyboard and mouse listeners for Java.
* [peter-lawrey/Java-Chronicle](https://github.com/peter-lawrey/Java-Chronicle) - Java Indexed Record Chronicle
* [googleapis/google-http-java-client](https://github.com/googleapis/google-http-java-client) - Google HTTP Client Library for Java
* [aol/cyclops](https://github.com/aol/cyclops) - An advanced, but easy to use, platform for writing functional applications in Java 8.
* [menacher/java-game-server](https://github.com/menacher/java-game-server) - Jetserver is a high speed nio socket based multiplayer java game server written using Netty and Mike Rettig's Jetlang.It is specifically tuned for network based multiplayer games and supports TCP and UDP network protocols.
* [fusesource/mqtt-client](https://github.com/fusesource/mqtt-client) - A Java MQTT Client
* [psi-probe/psi-probe](https://github.com/psi-probe/psi-probe) - Advanced manager and monitor for Apache Tomcat, forked from Lambda Probe
* [sirthias/parboiled](https://github.com/sirthias/parboiled) - Elegant parsing in Java and Scala - lightweight, easy-to-use, powerful.
* [qiurunze123/threadandjuc](https://github.com/qiurunze123/threadandjuc) - ⭐⭐⭐⭐高并发-高可靠-高性能three-high-import导入系统-高并发多线程进阶
* [gaopu/Java](https://github.com/gaopu/Java) - 一些用Java写的小东西（没什么用，大家不要star了😄）
* [ocpsoft/prettytime](https://github.com/ocpsoft/prettytime) - Social Style Date and Time Formatting for Java
* [tang-jie/NettyRPC](https://github.com/tang-jie/NettyRPC) - NettyRPC is high performance java rpc server base on Netty,using kryo,hessian,protostuff support message serialization.
* [manifold-systems/manifold](https://github.com/manifold-systems/manifold) - Manifold is a Java compiler plugin, its features include Metaprogramming, Properties, Extension Methods, Operator Overloading, Templates, a Preprocessor, and more.
* [wupeixuan/JDKSourceCode1.8](https://github.com/wupeixuan/JDKSourceCode1.8) - Jdk1.8源码解析
* [TEAMMATES/teammates](https://github.com/TEAMMATES/teammates) - This is the project website for the TEAMMATES feedback management tool for education
* [Guardsquare/proguard](https://github.com/Guardsquare/proguard) - ProGuard, Java optimizer and obfuscator
* [varunest/SparkButton](https://github.com/varunest/SparkButton) - Android library to create buttons with Twitter's heart like animation.
* [opensourceBIM/BIMserver](https://github.com/opensourceBIM/BIMserver) - The open source BIMserver platform
* [vmihalachi/turbo-editor](https://github.com/vmihalachi/turbo-editor) - Simple and powerful File Editor for Android. All is licensed under the GPLv3 license.
* [rampatra/jbot](https://github.com/rampatra/jbot) - Make Slack and Facebook Bots in Java.
* [mzheravin/exchange-core](https://github.com/mzheravin/exchange-core) - Ultra-fast matching engine written in Java based on LMAX Disruptor, Eclipse Collections, Real Logic Agrona, OpenHFT, LZ4 Java, and Adaptive Radix Trees.
* [bazaarvoice/jolt](https://github.com/bazaarvoice/jolt) - JSON to JSON transformation library written in Java.
* [braisdom/ObjectiveSql](https://github.com/braisdom/ObjectiveSql) - Writing SQL using Java syntax
* [Shashank02051997/FancyToast-Android](https://github.com/Shashank02051997/FancyToast-Android) - Make your native android Toasts Fancy. A library that takes the standard Android toast to the next level with a variety of styling options. Style your toast from code.
* [awslabs/aws-serverless-java-container](https://github.com/awslabs/aws-serverless-java-container) - A Java wrapper to run Spring, Jersey, Spark, and other apps inside AWS Lambda.
* [siriscac/RippleView](https://github.com/siriscac/RippleView) - View that imitates Ripple Effect on click which was introduced in Android L  (for Android 2.3+)
* [google-ar/sceneform-android-sdk](https://github.com/google-ar/sceneform-android-sdk) - Sceneform SDK for Android
* [schemacrawler/SchemaCrawler](https://github.com/schemacrawler/SchemaCrawler) - Free database schema discovery and comprehension tool
* [codenameone/CodenameOne](https://github.com/codenameone/CodenameOne) - Cross-platform framework for building truly native mobile apps with Java or Kotlin. Write Once Run Anywhere support for iOS, Android, Desktop & Web.
* [puniverse/capsule](https://github.com/puniverse/capsule) - Dead-Simple Packaging and Deployment for JVM Apps
* [sofastack/sofa-ark](https://github.com/sofastack/sofa-ark) - SOFAArk is a light-weight，java based classloader isolation framework.
* [apache/cloudstack](https://github.com/apache/cloudstack) - Apache Cloudstack
* [square/javapoet](https://github.com/square/javapoet) - A Java API for generating .java source files.
* [grpc/grpc-java](https://github.com/grpc/grpc-java) - The Java gRPC implementation. HTTP/2 based RPC
* [pxb1988/dex2jar](https://github.com/pxb1988/dex2jar) - Tools to work with android .dex and java .class files
* [perwendel/spark](https://github.com/perwendel/spark) - A simple expressive web framework for java. Spark has a kotlin DSL https://github.com/perwendel/spark-kotlin
* [jhy/jsoup](https://github.com/jhy/jsoup) - jsoup: the Java HTML parser, built for HTML editing, cleaning, scraping, and XSS safety.
* [apereo/cas](https://github.com/apereo/cas) - Apereo CAS - Enterprise Single Sign On for all earthlings and beyond.
* [DuGuQiuBai/Java](https://github.com/DuGuQiuBai/Java) - 27天成为Java大神
* [doocs/leetcode](https://github.com/doocs/leetcode) - 😏 LeetCode solutions in any programming language | 多种编程语言实现 LeetCode、《剑指 Offer（第 2 版）》、《程序员面试金典（第 6 版）》题解
* [TooTallNate/Java-WebSocket](https://github.com/TooTallNate/Java-WebSocket) - A barebones WebSocket client and server implementation written in 100% Java.
* [InterestingLab/seatunnel](https://github.com/InterestingLab/seatunnel) - Production Ready Data Integration Product, documentation：
* [jhipster/jhipster-sample-app](https://github.com/jhipster/jhipster-sample-app) - This is a sample application created with JHipster
* [mitre/HTTP-Proxy-Servlet](https://github.com/mitre/HTTP-Proxy-Servlet) - Smiley's HTTP Proxy implemented as a Java servlet
* [codinguser/gnucash-android](https://github.com/codinguser/gnucash-android) - Gnucash for Android mobile companion application.
* [SpongePowered/SpongeForge](https://github.com/SpongePowered/SpongeForge) - A Forge mod that implements SpongeAPI
* [HanSolo/tilesfx](https://github.com/HanSolo/tilesfx) - A JavaFX library containing tiles that can be used for dashboards.
* [florent37/FiftyShadesOf](https://github.com/florent37/FiftyShadesOf) - An elegant context-care loading placeholder for Android
* [ajanata/PretendYoureXyzzy](https://github.com/ajanata/PretendYoureXyzzy) - A web clone of the card game Cards Against Humanity.
* [QuadFlask/colorpicker](https://github.com/QuadFlask/colorpicker) - 🍭color picker for android
* [itext/itext7](https://github.com/itext/itext7) - iText 7 for Java represents the next level of SDKs for developers that want to take advantage of the benefits PDF can bring. Equipped with a better document engine, high and low-level programming capabilities and the ability to create, edit and enhance PDF documents, iText 7 can be a boon to nearly every workflow.
* [MyCollab/mycollab](https://github.com/MyCollab/mycollab) - An open source, free, high performance, stable and secure Java Application Business Platform of Project Management and Document
* [Java-aid/Hackerrank-Solutions](https://github.com/Java-aid/Hackerrank-Solutions) - hackerrank solutions github | hackerrank all solutions | hackerrank solutions for java | hackerrank video tutorial | hackerrank cracking the coding interview solutions | hackerrank data structures  | hackerrank solutions algorithms  | hackerrank challenge | hackerrank coding challenge | hackerrank algorithms solutions github| hackerrank problem solving | hackerrank programs solutions | JAVAAID |all hackerrank solutions | Coding Interview Preparation
* [berndruecker/flowing-retail](https://github.com/berndruecker/flowing-retail) - Sample application demonstrating an order fulfillment system decomposed into multiple independant components (e.g. microservices). Showing concrete implementation alternatives using e.g. Java, Spring Boot, Apache Kafka, Camunda, Zeebe, ...
* [apache/struts](https://github.com/apache/struts) - Mirror of Apache Struts
* [patric-r/jvmtop](https://github.com/patric-r/jvmtop) - Java monitoring for the command-line, profiler included
* [THEONE10211024/RxJavaSamples](https://github.com/THEONE10211024/RxJavaSamples) - 收集了RxJava常见的使用场景，例子简洁、经典、易懂...
* [tmobile/pacbot](https://github.com/tmobile/pacbot) - PacBot (Policy as Code Bot)
* [kangjianwei/LearningJDK](https://github.com/kangjianwei/LearningJDK) - JDK源码阅读笔记
* [DreamCats/java-notes](https://github.com/DreamCats/java-notes) - 自己的学习笔记。包含：个人秋招经历、🐂客面经问题按照频率总结、Java一系列知识、数据库、分布式、微服务、前端、技术面试、每日文章等(持续更新)
* [stephanenicolas/toothpick](https://github.com/stephanenicolas/toothpick) - A scope tree based Dependency Injection (DI) library for Java / Kotlin / Android.
* [rkalla/imgscalr](https://github.com/rkalla/imgscalr) - Simple Java image-scaling library implementing Chris Campbell's incremental scaling algorithm as well as Java2D's "best-practices" image-scaling techniques.
* [zalando/intellij-swagger](https://github.com/zalando/intellij-swagger) - A plugin to help you easily edit Swagger and OpenAPI specification files inside IntelliJ IDEA
* [linkedin/parseq](https://github.com/linkedin/parseq) - Asynchronous Java made easier
* [leibnitz27/cfr](https://github.com/leibnitz27/cfr) - This is the public repository for the CFR Java decompiler
* [googleapis/google-api-java-client](https://github.com/googleapis/google-api-java-client) - Google APIs Client Library for Java
* [klinker24/talon-for-twitter-android](https://github.com/klinker24/talon-for-twitter-android) - The most powerful and beautiful Twitter client available.
* [devnied/EMV-NFC-Paycard-Enrollment](https://github.com/devnied/EMV-NFC-Paycard-Enrollment) - A Java library used to read and extract data from NFC EMV credit cards (Android/PCSC).
* [Azure/azure-sdk-for-java](https://github.com/Azure/azure-sdk-for-java) - This repository is for active development of the Azure SDK for Java. For consumers of the SDK we recommend visiting our public developer docs at https://docs.microsoft.com/java/azure/ or our versioned developer docs at https://azure.github.io/azure-sdk-for-java.
* [chenssy89/jutils](https://github.com/chenssy89/jutils) - jutils，通用的Java工具类，主要包括基础工具类（时间、正则表达式、字符串、随机数等等），excel解析生成、word解析生成、文件操作、图片操作、敏感字、加解密等等。
* [microsoft/gctoolkit](https://github.com/microsoft/gctoolkit) - Tool for parsing GC logs
* [SpongePowered/SpongeAPI](https://github.com/SpongePowered/SpongeAPI) - A Minecraft plugin API
* [nguyenq/tess4j](https://github.com/nguyenq/tess4j) - Java JNA wrapper for Tesseract OCR API
* [zaiyunduan123/Java-Summarize](https://github.com/zaiyunduan123/Java-Summarize) - :books:Java核心知识点整理（包括Java基础、JVM、数据库、计算机网络、算法、操作系统、设计模式、系统设计、框架原理）
* [JaceyRx/Examination_System](https://github.com/JaceyRx/Examination_System) - 一个简单的教务查询系统（主要技术SpringMVC + Spring + Mybatis + Shiro + Bootstrap）
* [stealthcopter/AndroidNetworkTools](https://github.com/stealthcopter/AndroidNetworkTools) - Set of useful android network tools
* [magese/ik-analyzer-solr](https://github.com/magese/ik-analyzer-solr) - ik-analyzer for solr 7.x-8.x
* [apache/opennlp](https://github.com/apache/opennlp) - Mirror of Apache OpenNLP
* [datumbox/datumbox-framework](https://github.com/datumbox/datumbox-framework) - Datumbox is an open-source Machine Learning framework written in Java which allows the rapid development of Machine Learning and Statistical applications.
* [lets-mica/mica](https://github.com/lets-mica/mica) - Spring Cloud 微服务开发核心工具集。工具类、验证码、http、redis、ip2region、xss 等，开箱即用。 🔝 🔝 记得右上角点个star 关注更新！
* [Grover-c13/PokeGOAPI-Java](https://github.com/Grover-c13/PokeGOAPI-Java) - Pokemon Go API
* [bramp/ffmpeg-cli-wrapper](https://github.com/bramp/ffmpeg-cli-wrapper) - Java wrapper around the FFmpeg command line tool
* [xujeff/tianti](https://github.com/xujeff/tianti) - java轻量级的CMS解决方案-天梯。天梯是一个用java相关技术搭建的后台CMS解决方案，用户可以结合自身业务进行相应扩展，同时提供了针对dao、service等的代码生成工具。技术选型：Spring Data JPA、Hibernate、Shiro、 Spring MVC、Layer、Mysql等。
* [openmrs/openmrs-core](https://github.com/openmrs/openmrs-core) - OpenMRS API and web application code
* [diwi/PixelFlow](https://github.com/diwi/PixelFlow) - A Processing/Java library for high performance GPU-Computing (GLSL). Fluid Simulation + SoftBody Dynamics + Optical Flow + Rendering + Image Processing + Particle Systems + Physics +...
* [pengwei1024/LogUtils](https://github.com/pengwei1024/LogUtils) - More convenient and easy to use android Log manager
* [jiang111/RxJavaApp](https://github.com/jiang111/RxJavaApp) - 学习RxJava操作符的APP,新增RxJava2.x介绍
* [MSPaintIDE/MSPaintIDE](https://github.com/MSPaintIDE/MSPaintIDE) - Programming in MS Paint
* [yahoo/egads](https://github.com/yahoo/egads) - A Java package to automatically detect anomalies in large scale time-series data
* [alibaba/taokeeper](https://github.com/alibaba/taokeeper) - ZooKeeper-Monitor, a monitor for zookeeper in java. Download https://github.com/alibaba/taokeeper/downloads
* [bin392328206/six-finger](https://github.com/bin392328206/six-finger) - 📓从Java基础、JavaWeb基础到常用的框架再到面试题、微服务、分布式、大数据都有完整的教程，几乎涵盖了Java必备的知识点
* [influxdata/influxdb-java](https://github.com/influxdata/influxdb-java) - Java client for InfluxDB
* [zalando/logbook](https://github.com/zalando/logbook) - An extensible Java library for HTTP request and response logging
* [rabbitmq/rabbitmq-java-client](https://github.com/rabbitmq/rabbitmq-java-client) - RabbitMQ Java client
* [eclipse/eclipse.jdt.ls](https://github.com/eclipse/eclipse.jdt.ls) - Java language server
* [abel533/ECharts](https://github.com/abel533/ECharts) - 这是一个针对ECharts2.x版本的Java类库，实现了所有ECharts中的Json结构对应的Java对象，并且可以很方便的创建Option,Series等
* [SilenceIM/Silence](https://github.com/SilenceIM/Silence) - PROJECT MOVED: https://git.silence.dev/Silence/Silence-Android/ (GitHub is just a mirror.)
* [UCodeUStory/DataStructure](https://github.com/UCodeUStory/DataStructure) - 💋💋数据结构、算法总结、学习算法的时间复杂度、空间复杂度、分析算法特点以及应用、Java面试难题、Android面试难题
* [hsiafan/apk-parser](https://github.com/hsiafan/apk-parser) - Apk parser for java
* [aliyun/aliyun-oss-java-sdk](https://github.com/aliyun/aliyun-oss-java-sdk) - Aliyun OSS SDK for Java
* [Netflix/astyanax](https://github.com/Netflix/astyanax) - Cassandra Java Client
* [pgjdbc/pgjdbc](https://github.com/pgjdbc/pgjdbc) - Postgresql JDBC Driver
* [journaldev/journaldev](https://github.com/journaldev/journaldev) - JournalDev Projects
* [Netflix/hollow](https://github.com/Netflix/hollow) - Hollow is a java library and toolset for disseminating in-memory datasets from a single producer to many consumers for high performance read-only access.
* [ff4j/ff4j](https://github.com/ff4j/ff4j) - Feature Flags for Java made easy
* [trekawek/coffee-gb](https://github.com/trekawek/coffee-gb) - Gameboy emulator in Java 8.
* [apache/incubator-sedona](https://github.com/apache/incubator-sedona) - A cluster computing framework for processing large-scale geospatial data
* [dadoonet/fscrawler](https://github.com/dadoonet/fscrawler) - Elasticsearch File System Crawler (FS Crawler)
* [open-telemetry/opentelemetry-java](https://github.com/open-telemetry/opentelemetry-java) - OpenTelemetry Java SDK
* [mpatric/mp3agic](https://github.com/mpatric/mp3agic) - A java library for reading mp3 files and reading / manipulating the ID3 tags (ID3v1 and ID3v2.2 through ID3v2.4).
* [metasfresh/metasfresh](https://github.com/metasfresh/metasfresh) - We do Open Source ERP - Fast, Flexible & Free Software to scale your Business.
* [DragonetMC/DragonProxy](https://github.com/DragonetMC/DragonProxy) - 🐲 A proxy to allow Minecraft: Bedrock clients to connect to Minecraft: Java Edition servers.
* [mgarin/weblaf](https://github.com/mgarin/weblaf) - WebLaF is a fully open-source Look & Feel and component library written in pure Java for cross-platform desktop Swing applications.
* [wfh45678/radar](https://github.com/wfh45678/radar) - 实时风控引擎(Risk Engine)，自定义规则引擎（Rule Script），完美支持中文，适用于反欺诈(Anti-fraud)应用场景，开箱即用！！！移动互联网时代的风险管理利器，你 Get 到了吗？
* [18601949127/DiDiCallCar](https://github.com/18601949127/DiDiCallCar) - 这是我自己做的一个类似滴滴打车的Android出行项目，主要针对滴滴等出行平台一直饱受质疑的“人车不符”问题，以及当前越发火热的或计划和出海战略，给出行项目增加了下面几个功能：  1. RFID识别验证功能：在司机证件或者车内识别硬件嵌入RFID识别芯片，乘客使用手机读取到芯片信息，并且通过网络发送到出行平台数据库进行验证（我用JNI加了一个C语言的MD5加密算法对识别到的信息进行了加密）。如果不是合规的“人”或“车”，则不能完成订单并向平台或监管单位汇报当前位置。（为了方便读者测试，可以使用手机读取任何一个加密或非加密RFID芯片，比如银行卡、公交卡等，我在代码中的验证前阶段把芯片信息都换成我自己的司机信息，确保读者测试时可以收到服务器的回复） 2. 海外版功能：点击切换当前语言。 3. 司机证件号码识别功能：读取司机证件上的证件号码，也可以用来与出行平台数据库的接单司机信息进行。I complete this whole project on my own . Including Android application programming，web server ( Apache + PHP + MySQL),  and UI.  1．Map route planing。You can use mobile phone choose pick up & destination address，application provide address name hint and draw optimized route for user , then call car for you. 2．RFID authentication function：User can use application to scan driver license or other RFID hardware, then use NDK MD5 algorithm encrypt RFID number, and send it to Web Server Database, check with driver information and authenticate ID number , if ID number coherent with driver info , send back driver information to User and continue call car order . record user location  and alert if ID not coherent. 3．Driver License Number Recognition : Application can recognize driver license digit number ,and also can send to web server for authentication & feed back result to user.
* [Minestom/Minestom](https://github.com/Minestom/Minestom) - 1.17.1 Lightweight and multi-threaded Minecraft server
* [bufferapp/BufferTextInputLayout](https://github.com/bufferapp/BufferTextInputLayout) - A simple customised version of the TextInputLayout from the Android Design Support Library ⌨️
* [AOF-Dev/MCinaBox](https://github.com/AOF-Dev/MCinaBox) - MCinaBox - A Minecraft: Java Edition Launcher for Android.  An Encapsulation of [CosineMath's BoatApp](https://github.com/AOF-Dev/BoatApp).
* [spotify/mobius](https://github.com/spotify/mobius) - A functional reactive framework for managing state evolution and side-effects.
* [oracle/tribuo](https://github.com/oracle/tribuo) - Tribuo - A Java machine learning library
* [DWorkS/VolleyPlus](https://github.com/DWorkS/VolleyPlus) - 🏐 Volley library : make everything faster . Its an improvements for Volley by Google for Android  https://android.googlesource.com/platform/frameworks/volley
* [alibaba/Alink](https://github.com/alibaba/Alink) - Alink is the Machine Learning algorithm platform based on Flink, developed by the PAI team of Alibaba computing platform.
* [dboissier/mongo4idea](https://github.com/dboissier/mongo4idea) - MongoDB integration in Intellij
* [bravoborja/FocusResize](https://github.com/bravoborja/FocusResize) - A custom animation with scroll listener to recycler views
* [mahmoudparsian/data-algorithms-book](https://github.com/mahmoudparsian/data-algorithms-book) -  MapReduce, Spark, Java, and Scala for Data Algorithms Book
* [tony19/logback-android](https://github.com/tony19/logback-android) - 📄The reliable, generic, fast and flexible logging framework for Android
* [awslabs/aws-sdk-android-samples](https://github.com/awslabs/aws-sdk-android-samples) - This repository has samples that demonstrate various aspects of the AWS SDK for Android, you can get the SDK source on Github https://github.com/aws-amplify/aws-sdk-android/
* [FXMisc/RichTextFX](https://github.com/FXMisc/RichTextFX) - Rich-text area for JavaFX
* [good-life/PushTalk](https://github.com/good-life/PushTalk) - 推聊是一个基于极光推送 (JPush) 的手机聊天系统。支持群聊与点对点聊天。当前包括 Android客户端、iOS客户端与 Java服务器端。3分钟就可以整套系统跑起来。
* [FuZhucheng/SSM](https://github.com/FuZhucheng/SSM) - J2EE项目系列（四）–SSM框架构建积分系统和基本商品检索系统（Spring+SpringMVC+MyBatis+Lucene+Redis+MAVEN）
* [borball/weixin-sdk](https://github.com/borball/weixin-sdk) - 微信公众平台(订阅号、服务号、企业号、小程序)、微信开放平台和微信支付 Java SDK
* [jbake-org/jbake](https://github.com/jbake-org/jbake) - Java based open source static site/blog generator for developers & designers.
* [sukritishah15/DS-Algo-Point](https://github.com/sukritishah15/DS-Algo-Point) - This repository contains codes for various data structures and algorithms in C, C++, Java, Python, C#, Go, JavaScript, PHP, Kotlin and Scala
* [neoremind/fluent-validator](https://github.com/neoremind/fluent-validator) - A Java validation framework leveraging fluent interface style and JSR 303 specification
* [jline/jline3](https://github.com/jline/jline3) - JLine is a Java library for handling console input.
* [Gottox/socket.io-java-client](https://github.com/Gottox/socket.io-java-client) - Socket.IO Client Implementation in Java
* [murraco/spring-boot-jwt](https://github.com/murraco/spring-boot-jwt) - JWT auth service using Spring Boot, Spring Security and MySQL
* [libgdx/gdx-ai](https://github.com/libgdx/gdx-ai) - Artificial Intelligence framework for games based on libGDX or not. Features: Steering Behaviors, Formation Motion, Pathfinding, Behavior Trees and Finite State Machines
* [playgameservices/android-basic-samples](https://github.com/playgameservices/android-basic-samples) - Google Play game services - Android samples
* [appium/java-client](https://github.com/appium/java-client) - Java language binding for writing Appium Tests, conforms to Mobile JSON Wire & W3C Webdriver Protocol
* [superhj1987/pragmatic-java-engineer](https://github.com/superhj1987/pragmatic-java-engineer) - Java工程师修炼之道 - 梳理Java知识体系，沓实架构基础
* [the3deers/android-3D-model-viewer](https://github.com/the3deers/android-3D-model-viewer) - Android OpenGL 2.0 application to view 3D models. Published on Play Store
* [AppliedEnergistics/Applied-Energistics-2](https://github.com/AppliedEnergistics/Applied-Energistics-2) - A Minecraft Mod about Matter, Energy and using them to conquer the world..
* [kaikramer/keystore-explorer](https://github.com/kaikramer/keystore-explorer) - KeyStore Explorer is a free GUI replacement for the Java command-line utilities keytool and jarsigner.
* [hazelcast/hazelcast-jet](https://github.com/hazelcast/hazelcast-jet) - Distributed Stream and Batch Processing
* [RyanFehr/HackerRank](https://github.com/RyanFehr/HackerRank) - HackerRank solutions in Java/JS/Python/C++/C#
* [leventov/Koloboke](https://github.com/leventov/Koloboke) - Java Collections till the last breadcrumb of memory and performance
* [aol/micro-server](https://github.com/aol/micro-server) - Microserver is a Java 8 native, zero configuration, standards based, battle hardened library to run Java Rest Microservices via a standard Java main class. Supporting pure Microservice or Micro-monolith styles.
* [JetBrains/xodus](https://github.com/JetBrains/xodus) - Transactional schema-less embedded database used by JetBrains YouTrack and JetBrains Hub.
* [zxh0/classpy](https://github.com/zxh0/classpy) - GUI tool for investigating Java class files
* [lenskit/lenskit](https://github.com/lenskit/lenskit) - LensKit recommender toolkit.
* [apache/parquet-format](https://github.com/apache/parquet-format) - Apache Parquet
* [twitter/hbc](https://github.com/twitter/hbc) - A Java HTTP client for consuming Twitter's realtime Streaming API
* [WeBankFinTech/Linkis](https://github.com/WeBankFinTech/Linkis) - Linkis helps easily connect to various back-end computation/storage engines(Spark, Python, TiDB...), exposes various interfaces(REST, JDBC, Java ...), with multi-tenancy, high performance, and resource control.
* [Pi4J/pi4j](https://github.com/Pi4J/pi4j) - Java I/O library for Raspberry Pi (GPIO, I2C, SPI, UART)
* [ufo22940268/android-justifiedtextview](https://github.com/ufo22940268/android-justifiedtextview) - android justified textview
* [glowroot/glowroot](https://github.com/glowroot/glowroot) - Easy to use, very low overhead, Java APM
* [mapsforge/mapsforge](https://github.com/mapsforge/mapsforge) - Vector map library and writer - running on Android and Desktop.
* [jnr/jnr-ffi](https://github.com/jnr/jnr-ffi) - Java Abstracted Foreign Function Layer
* [tomakehurst/wiremock](https://github.com/tomakehurst/wiremock) - A tool for mocking HTTP services
* [InterestingLab/waterdrop](https://github.com/InterestingLab/waterdrop) - 生产环境的海量数据计算产品，文档地址：
* [klinker-apps/talon-for-twitter-android](https://github.com/klinker-apps/talon-for-twitter-android) - The most powerful and beautiful Twitter client available.
* [zhangdaiscott/jeecg](https://github.com/zhangdaiscott/jeecg) - JEECG是一款基于代码生成器的J2EE快速开发平台，开源界“小普元”超越传统商业企业级开发平台。引领新的开发模式(Online Coding模式(自定义表单) - > 代码生成器模式 - > 手工MERGE智能开发)， 可以帮助解决Java项目90%的重复工作，让开发更多关注业务逻辑。既能快速提高开发效率，帮助公司节省人力成本，同时又不失灵活性。具备：表单配置能力（无需编码）、移动配置能力、工作流配置能力、报表配置能力（支持移动端）、插件开发能力（可插拔）
* [crashub/crash](https://github.com/crashub/crash) - The shell for the Java Platform
* [jfaster/mango](https://github.com/jfaster/mango) - Distributed ORM Framework for Java
* [ernestoyaquello/VerticalStepperForm](https://github.com/ernestoyaquello/VerticalStepperForm) - Vertical Stepper Form Library for Android. It follows Google Material Design guidelines.
* [sword-org/wechat4j](https://github.com/sword-org/wechat4j) - wechat4j is wechat(weixin) develop framework for java 微信开发框架JAVA版，最简单易用微信开发框架
* [h4de5ing/AndroidCommon](https://github.com/h4de5ing/AndroidCommon) - 基于Android系统Api封装常用工具类
* [facebookarchive/swift](https://github.com/facebookarchive/swift) - An annotation-based Java library for creating Thrift serializable types and services.
* [vladmihalcea/flexy-pool](https://github.com/vladmihalcea/flexy-pool) - FlexyPool adds metrics and failover strategies to a given Connection Pool, allowing it to resize on demand.
* [dieforfree/qart4j](https://github.com/dieforfree/qart4j) - QR code ASCII art for java
* [eclipse-archived/smarthome](https://github.com/eclipse-archived/smarthome) - Eclipse SmartHome™ project
* [google/tink](https://github.com/google/tink) - Tink is a multi-language, cross-platform, open source library that provides cryptographic APIs that are secure, easy to use correctly, and hard(er) to misuse.
* [rzwitserloot/lombok](https://github.com/rzwitserloot/lombok) - Very spicy additions to the Java programming language.
* [eclipse/openj9](https://github.com/eclipse/openj9) - Eclipse OpenJ9: A Java Virtual Machine for OpenJDK that's optimized for small footprint, fast start-up, and high throughput.   Builds on Eclipse OMR (https://github.com/eclipse/omr) and combines with the Extensions for OpenJDK for OpenJ9 repo.
* [Picovoice/porcupine](https://github.com/Picovoice/porcupine) - On-device wake word detection powered by deep learning.
* [awslabs/djl](https://github.com/awslabs/djl) - An Engine-Agnostic Deep Learning Framework in Java
* [youxin11544/MVP-RxJava-Hybride](https://github.com/youxin11544/MVP-RxJava-Hybride) - This is an Android MVP model good architecture design，Which also inherited the Android architecture and HTML 5 interaction。（这是一个Android MVP模型良好的架构设计,同时也做了Android和HTML 5交互架构，用到了RxJava+Retrofit+MVP+泛型缩减mvp+模板模式+命令模式+观察者模式+管理者模式 +简单工厂模式）
* [florent37/AwesomeBar](https://github.com/florent37/AwesomeBar) - Just beautiful
* [Cuieney/kotlin-life](https://github.com/Cuieney/kotlin-life) - App界的一股清流 音视频vr应有尽有 完全按照Material design规范设计的App （written with java and Kotlin）
* [davidmoten/rtree](https://github.com/davidmoten/rtree) - Immutable in-memory R-tree and R*-tree implementations in Java with reactive api
* [bluejoe2008/openwebflow](https://github.com/bluejoe2008/openwebflow) - 基于Activiti的工作流引擎扩展，接管了Activiti对活动权限以及用户表的管理，并提供了催办、代办、加签（包括前加签/后加签）、自由跳转、分裂节点等功能
* [kaitoy/pcap4j](https://github.com/kaitoy/pcap4j) - A Java library for capturing, crafting, and sending packets.
* [bigmeow/JWT](https://github.com/bigmeow/JWT) - webapp用户身份认证方案 JSON WEB TOKEN 实现Deme示例，Java版
* [PebbleTemplates/pebble](https://github.com/PebbleTemplates/pebble) - Java Template Engine
* [looly/hutool](https://github.com/looly/hutool) - A set of tools that keep Java sweet.
* [wikimedia/apps-android-wikipedia](https://github.com/wikimedia/apps-android-wikipedia) -  📱The official Wikipedia app for Android!
* [akarnokd/RxJavaInterop](https://github.com/akarnokd/RxJavaInterop) - Library to convert between RxJava 1.x and 2.x/3.x reactive types, schedulers and resource handles.
* [Andy671/Dachshund-Tab-Layout](https://github.com/Andy671/Dachshund-Tab-Layout) - Extended Android Tab Layout with animated indicators that have continuous feedback.
* [hibernate/hibernate-validator](https://github.com/hibernate/hibernate-validator) - Hibernate Validator - Jakarta Bean Validation Reference Implementation
* [lionsoul2014/ip2region](https://github.com/lionsoul2014/ip2region) - Ip2region is a offline IP location library with accuracy rate of 99.9% and 0.0x millseconds searching performance. DB file is ONLY a few megabytes with all IP address stored. binding for Java,PHP,C,Python,Nodejs,Golang,C#,lua. Binary,B-tree,Memory searching algorithm
* [apache/lucene-solr](https://github.com/apache/lucene-solr) - Apache Lucene and Solr open-source search software
* [zeebe-io/zeebe](https://github.com/zeebe-io/zeebe) - Distributed Workflow Engine for Microservices Orchestration
* [houko/SpringBootUnity](https://github.com/houko/SpringBootUnity) - rabbitmq、redis、scheduled、socket、mongodb、Swagger2、spring data jpa、Thymeleaf、freemarker etc. (muti module spring boot project) (with spring boot framework，different bussiness scence with different technology。)
* [spotify/heroic](https://github.com/spotify/heroic) - The Heroic Time Series Database
* [airlift/airline](https://github.com/airlift/airline) - Java annotation-based framework for parsing Git like command line structures
* [chatopera/cskefu](https://github.com/chatopera/cskefu) - 🌲 春松客服，多渠道智能客服系统，开源客服系统 ，机器人客服
* [bugsnag/bugsnag-android](https://github.com/bugsnag/bugsnag-android) - Bugsnag crash monitoring and reporting tool for Android apps
* [litesuits/android-lite-http](https://github.com/litesuits/android-lite-http) - LiteHttp is a simple, intelligent and flexible HTTP framework for Android. With LiteHttp you can make HTTP request with only one line of code! It could convert a java model to the parameter and rander the response JSON as a java model intelligently.
* [michelelacorte/SwipeableCard](https://github.com/michelelacorte/SwipeableCard) - A simple implementation of swipe card like StreetView
* [Orbiter/anomic_ftp_server](https://github.com/Orbiter/anomic_ftp_server) - a simple ftp server in java
* [twitter/Serial](https://github.com/twitter/Serial) - Light-weight, fast framework for object serialization in Java, with Android support.
* [mrdear/JavaWEB](https://github.com/mrdear/JavaWEB) - JavaWEB学习之中的一些Demo(废弃)
* [0opslab/opslabJutil](https://github.com/0opslab/opslabJutil) - Java utils
* [blipinsk/FlippableStackView](https://github.com/blipinsk/FlippableStackView) - An Android library introducing a stack of Views with the first item being flippable.
* [bbottema/simple-java-mail](https://github.com/bbottema/simple-java-mail) - Simple API, Complex Emails (JavaMail smtp wrapper)
* [apache/sqoop](https://github.com/apache/sqoop) - Mirror of Apache Sqoop
* [xerial/snappy-java](https://github.com/xerial/snappy-java) - Snappy compressor/decompressor for Java
* [kungfoo/geohash-java](https://github.com/kungfoo/geohash-java) - Implementation of GeoHashes in java. We try to be/stay compliant to the spec, as far as possible.
* [pholser/junit-quickcheck](https://github.com/pholser/junit-quickcheck) - Property-based testing, JUnit-style
* [rakam-io/rakam-api](https://github.com/rakam-io/rakam-api) - 📈 Collect customer event data from your apps. (Note that this project only includes the API collector, not the visualization platform)
* [apache/mina](https://github.com/apache/mina) - Mirror of Apache MINA
* [wuyouzhuguli/FEBS-Shiro](https://github.com/wuyouzhuguli/FEBS-Shiro) - Spring Boot 2.2.5，Shiro1.4.2 & Layui 2.5.5 权限管理系统。预览地址：http://47.104.70.138:8080/login
* [line/armeria](https://github.com/line/armeria) - Asynchronous RPC/REST library built on top of Java 8, Netty, HTTP/2, Thrift and gRPC
* [Sable/soot](https://github.com/Sable/soot) - Soot - A Java optimization framework
* [liweiwei1419/LeetCode-Solution-in-Good-Style](https://github.com/liweiwei1419/LeetCode-Solution-in-Good-Style) - 我的 LeetCode 做题记录，正在加紧练习中。
* [Martin404/PayMap](https://github.com/Martin404/PayMap) - Java后端实现三方支付集成支付宝（国内、国际、移动端、PC端）、微信、银联（acp、upop）、光大（网关、网页）、邮政支付
* [MachinePublishers/jBrowserDriver](https://github.com/MachinePublishers/jBrowserDriver) - A programmable, embeddable web browser driver compatible with the Selenium WebDriver spec -- headless, WebKit-based, pure Java
