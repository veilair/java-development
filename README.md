# Java Development
Welcome to the world of Java Development. An ongoing curated list of frameworks and libraries, articles and books , talks and screencasts, recordings, blogs and github link repositories, learning tutorials and resources about Java Development. 
> Thanks to all contributors, you're awesome and wouldn't be possible without you! Our goal is to build a categorized community-driven collection of very well-known resources.

## `Table of Contents`

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

## `Projects`

### `Bean Mapping`

_Frameworks that ease bean mapping._

- [dOOv](https://github.com/doov-io/doov) - Provides fluent API for typesafe domain model validation and mapping. It uses annotations, code generation and a type safe DSL to make bean validation and mapping fast and easy.
- [JMapper](https://github.com/jmapper-framework/jmapper-core) - Uses byte code manipulation for lightning-fast mapping. Supports annotations and API or XML configuration.
- [MapStruct](https://github.com/mapstruct/mapstruct) - Code generator that simplifies mappings between different bean types, based on a convention-over-configuration approach.
- [ModelMapper](https://github.com/modelmapper/modelmapper) - Intelligent object mapping library that automatically maps objects to each other.
- [Orika](https://github.com/orika-mapper/orika) - JavaBean-mapping framework that recursively copies (among other capabilities) data from one object to another.
- [reMap](https://github.com/remondis-it/remap) - Lambda and method handle-based mapping which requires code and not annotations if objects have different names.
- [Selma](https://github.com/xebia-france/selma) - Annotation processor-based bean mapper.

### `Build`

_Tools that handle the build cycle and dependencies of an application._

- [Apache Maven](https://maven.apache.org) - Declarative build and dependency management that favors convention over configuration. It might be preferable to Apache Ant, which uses a rather procedural approach and can be difficult to maintain.
- [Bazel](https://bazel.build) - Tool from Google that builds code quickly and reliably.
- [Buck](https://github.com/facebook/buck) - Encourages the creation of small, reusable modules consisting of code and resources.
- [Gradle](https://gradle.org) - Incremental builds programmed via Groovy instead of declaring XML. Works well with Maven's dependency management.

### `Bytecode Manipulation`

_Libraries to manipulate bytecode programmatically._

- [ASM](https://asm.ow2.io) - All-purpose, low-level bytecode manipulation and analysis.
- [Byte Buddy](https://bytebuddy.net) - Further simplifies bytecode generation with a fluent API.
- [bytecode-viewer](https://github.com/Konloch/bytecode-viewer) - Java 8 Jar & Android APK reverse engineering suite. (GPL-3.0-only)
- [Byteman](https://byteman.jboss.org) - Manipulate bytecode at runtime via DSL (rules); mainly for testing/troubleshooting. (LGPL-2.1-or-later)
- [cglib](https://github.com/cglib/cglib) - Bytecode generation library.
- [Javassist](https://github.com/jboss-javassist/javassist) - Tries to simplify bytecode editing.
- [Mixin](https://github.com/SpongePowered/Mixin) - Manipulate bytecode at runtime using real Java code.
- [Perses](https://github.com/nicolasmanic/perses) - Dynamically injects failure/latency at the bytecode level according to principles of chaos engineering.

### `Caching`

_Libraries that provide caching facilities._

- [cache2k](https://cache2k.org) - In-memory high performance caching library.
- [Caffeine](https://github.com/ben-manes/caffeine) - High-performance, near-optimal caching library.
- [Ehcache](http://www.ehcache.org) - Distributed general-purpose cache.
- [Infinispan](https://infinispan.org) - Highly concurrent key/value datastore used for caching.

### `CLI`

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

### `Cluster Management`

_Frameworks that can dynamically manage applications inside of a cluster._

- [Apache Aurora](https://aurora.apache.org) - Mesos framework for long-running services and cron jobs.
- [Singularity](http://getsingularity.com) - Mesos framework that makes deployment and operations easy. It supports web services, background workers, scheduled jobs, and one-off tasks.

### `Code Analysis`

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

### `Code Coverage`

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
- [jOO??](https://github.com/jOOQ/jOOL) - Extension to Java 8 that aims to fix gaps in lambda by providing numerous missing types and a rich set of sequential Stream API additions.
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

### `IDE`

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

### `JSON`

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

### `JVM and JDK`

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
- [Prot??g??](https://protege.stanford.edu) - Provides an ontology editor and a framework to build knowledge-based systems.
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
- [Aleksey Shipil??v](https://twitter.com/shipilev) - Performance geek, benchmarking czar, concurrency bug hunter.
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

* [CyC2018/CS-Notes](https://github.com/CyC2018/CS-Notes) - :books: ?????????????????????????????????Leetcode?????????????????????????????????????????????????????????
* [Snailclimb/JavaGuide](https://github.com/Snailclimb/JavaGuide) - ???Java??????+???????????????????????????????????? Java ???????????????????????????????????????????????? Java ??????????????? JavaGuide???
* [iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns) - Design patterns implemented in Java
* [doocs/advanced-java](https://github.com/doocs/advanced-java) - ???? Core Interview Questions & Answers For Experienced Java(Backend) Developers | ????????? Java ???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [spring-projects/spring-boot](https://github.com/spring-projects/spring-boot) - Spring Boot
* [elastic/elasticsearch](https://github.com/elastic/elasticsearch) - Free and Open, Distributed, RESTful Search Engine
* [macrozheng/mall](https://github.com/macrozheng/mall) - mall????????????????????????????????????????????????????????????????????????????????????SpringBoot+MyBatis???????????????Docker?????????????????? ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [kdn251/interviews](https://github.com/kdn251/interviews) - Everything you need to know to get the job.
* [ReactiveX/RxJava](https://github.com/ReactiveX/RxJava) - RxJava ??? Reactive Extensions for the JVM ??? a library for composing asynchronous and event-based programs using observable sequences for the Java VM.
* [google/guava](https://github.com/google/guava) - Google core libraries for Java
* [TheAlgorithms/Java](https://github.com/TheAlgorithms/Java) - All Algorithms implemented in Java
* [square/retrofit](https://github.com/square/retrofit) - A type-safe HTTP client for Android and the JVM
* [apache/dubbo](https://github.com/apache/dubbo) - Apache Dubbo is a high-performance, java based, open source RPC framework.
* [PhilJay/MPAndroidChart](https://github.com/PhilJay/MPAndroidChart) - A powerful ???? Android chart view / graph view library, supporting line- bar- pie- radar- bubble- and candlestick charts as well as scaling, panning and animations.
* [zxing/zxing](https://github.com/zxing/zxing) - ZXing ("Zebra Crossing") barcode scanning library for Java, Android
* [skylot/jadx](https://github.com/skylot/jadx) - Dex to Java decompiler
* [alibaba/arthas](https://github.com/alibaba/arthas) - Alibaba Java Diagnostic Tool Arthas/Alibaba Java????????????Arthas
* [ityouknow/spring-boot-examples](https://github.com/ityouknow/spring-boot-examples) - about learning Spring Boot via examples. Spring Boot ????????????????????????????????????????????????????????????
* [jeecgboot/jeecg-boot](https://github.com/jeecgboot/jeecg-boot) - ???????????????????????????????????????????????????SpringBoot 2.x???SpringCloud???Ant Design&Vue???Mybatis-plus???Shiro???JWT?????????????????????????????????????????????????????????????????????????????????! ????????????????????????OnlineCoding->????????????->??????MERGE?????????Java????????????70%???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [crossoverJie/JCSprout](https://github.com/crossoverJie/JCSprout) - ??????????? Java Core Sprout : basic, concurrent, algorithm
* [xkcoding/spring-boot-demo](https://github.com/xkcoding/spring-boot-demo) - ???????????????????????? actuator(??????)???admin(???????????????)???logback(??????)???aopLog(??????AOP??????web????????????)?????????????????????(json?????????????????????)???freemarker(????????????)???thymeleaf(????????????)???Beetl(????????????)???Enjoy(????????????)???JdbcTemplate(??????JDBC???????????????)???JPA(?????????ORM??????)???mybatis(?????????ORM??????)?????????Mapper(????????????Mybatis)???PageHelper(?????????Mybatis????????????)???mybatis-plus(????????????Mybatis)???BeetlSQL(?????????ORM??????)???upload(??????????????????????????????????????????)???redis(??????)???ehcache(??????)???email(????????????????????????)???task(??????????????????)???quartz(????????????????????????)???xxl-job(?????????????????????)???swagger(API??????????????????)???security(??????RBAC?????????????????????)???SpringSession(Session??????)???Zookeeper(??????AOP??????????????????)???RabbitMQ(????????????)???Kafka(????????????)???websocket(??????????????????????????????????????????)???socket.io(?????????)???ureport2(???????????????)????????????war??????????????? ElasticSearch(???????????????????????????)???Async(????????????)?????????Dubbo(???????????????starter)???MongoDB(???????????????)???neo4j(????????????)???docker(?????????)???JPA???????????????Mybatis?????????????????????????????????GrayLog(????????????)???JustAuth(???????????????)???LDAP(????????????)???????????????/??????????????????????????????(AOP + Guava RateLimiter)??????????????????(AOP + Redis + Lua)???ElasticSearch 7.x(???????????? Rest High Level Client)???HTTPS???Flyway(??????????????????)???UReport2(?????????????????????)???
* [alibaba/fastjson](https://github.com/alibaba/fastjson) - A fast JSON parser/generator for Java.
* [dbeaver/dbeaver](https://github.com/dbeaver/dbeaver) - Free universal database tool and SQL client
* [greenrobot/EventBus](https://github.com/greenrobot/EventBus) - Event bus for Android and Java that simplifies communication between Activities, Fragments, Threads, Services, etc. Less code, better quality.
* [SeleniumHQ/selenium](https://github.com/SeleniumHQ/selenium) - A browser automation framework and ecosystem.
* [alibaba/easyexcel](https://github.com/alibaba/easyexcel) - ????????????????????????????????????????????????java??????Excel??????
* [hollischuang/toBeTopJavaer](https://github.com/hollischuang/toBeTopJavaer) - To Be Top Javaer - Java?????????????????????
* [dromara/hutool](https://github.com/dromara/hutool) - ????A set of tools that keep Java sweet.
* [alibaba/spring-cloud-alibaba](https://github.com/alibaba/spring-cloud-alibaba) - Spring Cloud Alibaba provides a one-stop solution for application development for the distributed solutions of Alibaba middleware.
* [google/gson](https://github.com/google/gson) - A Java serialization/deserialization library to convert Java Objects into JSON and back
* [xuxueli/xxl-job](https://github.com/xuxueli/xxl-job) - A distributed task scheduling framework.??????????????????????????????XXL-JOB???
* [libgdx/libgdx](https://github.com/libgdx/libgdx) - Desktop/Android/HTML5/iOS Java game development framework
* [google/ExoPlayer](https://github.com/google/ExoPlayer) - An extensible media player for Android
* [jenkinsci/jenkins](https://github.com/jenkinsci/jenkins) - Jenkins automation server
* [alibaba/Sentinel](https://github.com/alibaba/Sentinel) - A powerful flow control component enabling reliability, resilience and monitoring for microservices. (??????????????????????????????????????????????????????)
* [redisson/redisson](https://github.com/redisson/redisson) - Redisson - Redis Java client with features of In-Memory Data Grid. Over 50 Redis based Java objects and services: Set, Multimap, SortedSet, Map, List, Queue, Deque, Semaphore, Lock, AtomicLong, Map Reduce, Publish / Subscribe, Bloom filter, Spring Cache, Tomcat, Scheduler, JCache API, Hibernate, MyBatis, RPC, local cache ...
* [apache/flink](https://github.com/apache/flink) - Apache Flink
* [mybatis/mybatis-3](https://github.com/mybatis/mybatis-3) - MyBatis SQL mapper framework for Java
* [oracle/graal](https://github.com/oracle/graal) - GraalVM: Run Programs Faster Anywhere :rocket:
* [dianping/cat](https://github.com/dianping/cat) - CAT ????????????????????????????????????????????? Java, C/C++, Node.js, Python, Go ??????????????????????????????????????????????????????????????????????????????MVC?????????RPC?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [brettwooldridge/HikariCP](https://github.com/brettwooldridge/HikariCP) - ??? HikariCP???A solid, high-performance, JDBC connection pool at last.
* [winterbe/java8-tutorial](https://github.com/winterbe/java8-tutorial) - Modern Java - A Guide to Java 8
* [android10/Android-CleanArchitecture](https://github.com/android10/Android-CleanArchitecture) - This is a sample app that is part of a series of blog posts I have written about how to architect an android application using Uncle Bob's clean architecture approach.
* [LMAX-Exchange/disruptor](https://github.com/LMAX-Exchange/disruptor) - High Performance Inter-Thread Messaging Library
* [Anuken/Mindustry](https://github.com/Anuken/Mindustry) - The automation tower defense game
* [medcl/elasticsearch-analysis-ik](https://github.com/medcl/elasticsearch-analysis-ik) - The IK Analysis plugin integrates Lucene IK analyzer into elasticsearch, support customized dictionary.
* [orhanobut/logger](https://github.com/orhanobut/logger) - ?????? Simple, pretty and powerful logger for android
* [prestodb/presto](https://github.com/prestodb/presto) - The official home of the Presto distributed SQL query engine for big data
* [Konloch/bytecode-viewer](https://github.com/Konloch/bytecode-viewer) - A Java 8+ Jar & Android APK Reverse Engineering Suite (Decompiler, Editor, Debugger & More)
* [eclipse-vertx/vert.x](https://github.com/eclipse-vertx/vert.x) - Vert.x is a tool-kit for building reactive applications on the JVM
* [mockito/mockito](https://github.com/mockito/mockito) - Most popular Mocking framework for unit tests written in Java
* [eclipse/deeplearning4j](https://github.com/eclipse/deeplearning4j) - Suite of tools for deploying and training deep learning models using the JVM. Highlights include model import for keras, tensorflow, and onnx/pytorch, a modular and tiny c++ library for running math code and a java based math library on top of the core c++ library. Also includes samediff: a pytorch/tensorflow like library for running deep learning using automatic differentiation.
* [openjdk/jdk](https://github.com/openjdk/jdk) - JDK main-line development
* [GoogleContainerTools/jib](https://github.com/GoogleContainerTools/jib) - ???? Build container images for your Java applications.
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
* [macrozheng/mall-swarm](https://github.com/macrozheng/mall-swarm) - mall-swarm?????????????????????????????????????????? Spring Cloud Hoxton & Alibaba???Spring Boot 2.3???Oauth2???MyBatis???Docker???Elasticsearch???Kubernetes???????????????????????????????????????Vue??????????????????????????????????????????mall-swarm?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????Spring Cloud?????????
* [square/moshi](https://github.com/square/moshi) - A modern JSON library for Kotlin and Java.
* [hs-web/hsweb-framework](https://github.com/hs-web/hsweb-framework) - hsweb (ha??s w??b) ???????????????spring-boot 2.x?????? ,???????????????????????????????????????????????????????????????????????????
* [OpenFeign/feign](https://github.com/OpenFeign/feign) - Feign makes writing java http clients easier
* [questdb/questdb](https://github.com/questdb/questdb) - An open source SQL database designed to process time series data, faster
* [dromara/Sa-Token](https://github.com/dromara/Sa-Token) - ?????????????????????????????????Java?????????????????????????????????????????????????????????????????????????????????Session????????????????????????????????????????????????OAuth2.0??????????????????Redis??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????token???????????????????????????????????????????????????????????????????????????jwt?????????Spring?????????WebFlux??????...
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
* [ionic-team/capacitor](https://github.com/ionic-team/capacitor) - Build cross-platform Native Progressive Web Apps for iOS, Android, and the Web ??????
* [json-path/JsonPath](https://github.com/json-path/JsonPath) - Java JsonPath implementation
* [checkstyle/checkstyle](https://github.com/checkstyle/checkstyle) - Checkstyle is a development tool to help programmers write Java code that adheres to a coding standard. By default it supports the Google Java Style Guide and Sun Code Conventions, but is highly configurable. It can be invoked with an ANT task and a command line program.
* [spring-projects/spring-security](https://github.com/spring-projects/spring-security) - Spring Security
* [flyway/flyway](https://github.com/flyway/flyway) - Flyway by Redgate ??? Database Migrations Made Easy.
* [apache/storm](https://github.com/apache/storm) - Mirror of Apache Storm
* [NanoHttpd/nanohttpd](https://github.com/NanoHttpd/nanohttpd) - Tiny, easily embeddable HTTP server in Java.
* [processing/processing](https://github.com/processing/processing) - Source code for the Processing Core and Development Environment (PDE)
* [NLPchina/ansj_seg](https://github.com/NLPchina/ansj_seg) - ansj??????.ict?????????java??????.???????????????????????????????????????ict. ????????????,????????????,????????????,?????????????????????
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
* [febsteam/FEBS-Shiro](https://github.com/febsteam/FEBS-Shiro) - Spring Boot 2.4.2???Shiro1.6.0 & Layui 2.5.6 ????????????????????????????????????http://47.104.70.138:8080/login
* [JakeWharton/DiskLruCache](https://github.com/JakeWharton/DiskLruCache) - Java implementation of a Disk-based LRU cache which specifically targets Android compatibility.
* [joelittlejohn/jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo) - Generate Java types from JSON or JSON Schema and annotate those types for data-binding with Jackson, Gson, etc
* [mrniko/netty-socketio](https://github.com/mrniko/netty-socketio) - Socket.IO server implemented on Java. Realtime java framework
* [bytedeco/javacv](https://github.com/bytedeco/javacv) - Java interface to OpenCV, FFmpeg, and more
* [kunal-kushwaha/DSA-Bootcamp-Java](https://github.com/kunal-kushwaha/DSA-Bootcamp-Java) - This repository consists of the code samples, assignments, and the curriculum for the Community Classroom complete Data Structures & Algorithms Java bootcamp.
* [liyifeng1994/ssm](https://github.com/liyifeng1994/ssm) - ??????????????????????????????SSM?????????SpringMVC + Spring + MyBatis
* [testcontainers/testcontainers-java](https://github.com/testcontainers/testcontainers-java) - Testcontainers is a Java library that supports JUnit tests, providing lightweight, throwaway instances of common databases, Selenium web browsers, or anything else that can run in a Docker container.
* [apache/zeppelin](https://github.com/apache/zeppelin) - Web-based notebook that enables data-driven, interactive data analytics and collaborative documents with SQL, Scala and more.
* [facebookarchive/rebound](https://github.com/facebookarchive/rebound) - A Java library that models spring dynamics and adds real world physics to your app.
* [springfox/springfox](https://github.com/springfox/springfox) - Automated JSON API documentation for API's built with Spring
* [sockeqwe/mosby](https://github.com/sockeqwe/mosby) - A Model-View-Presenter / Model-View-Intent library for modern Android apps
* [PaperMC/Paper](https://github.com/PaperMC/Paper) - High performance Spigot fork that aims to fix gameplay and mechanics inconsistencies
* [h2pl/Java-Tutorial](https://github.com/h2pl/Java-Tutorial) - ???Java??????????????????????????????????????????????????????Java??????????????????????????????????????????????????????????????????????????????Java???????????????????????????????????????????????????Java??????????????????????????????????????????????????????star????????????????????????
* [robolectric/robolectric](https://github.com/robolectric/robolectric) - Android Unit Testing Framework
* [evant/gradle-retrolambda](https://github.com/evant/gradle-retrolambda) - A gradle plugin for getting java lambda support in java 6, 7 and android
* [graphql-java/graphql-java](https://github.com/graphql-java/graphql-java) - GraphQL Java implementation
* [MindorksOpenSource/from-java-to-kotlin](https://github.com/MindorksOpenSource/from-java-to-kotlin) - From Java To Kotlin - Your Cheat Sheet For Java To Kotlin
* [changmingxie/tcc-transaction](https://github.com/changmingxie/tcc-transaction) - tcc-transaction???TCC?????????java??????
* [scribejava/scribejava](https://github.com/scribejava/scribejava) - Simple OAuth library for Java
* [Yalantis/Side-Menu.Android](https://github.com/Yalantis/Side-Menu.Android) - Side menu with some categories to choose.
* [apache/beam](https://github.com/apache/beam) - Apache Beam is a unified programming model for Batch and Streaming
* [MinecraftForge/MinecraftForge](https://github.com/MinecraftForge/MinecraftForge) - Modifications to the Minecraft base files to assist in compatibility between mods.
* [micronaut-projects/micronaut-core](https://github.com/micronaut-projects/micronaut-core) - Micronaut Application Framework
* [CameraKit/camerakit-android](https://github.com/CameraKit/camerakit-android) - Library for Android Camera 1 and 2 APIs. Massively increase stability and reliability of photo and video capture on all Android devices.
* [Vedenin/useful-java-links](https://github.com/Vedenin/useful-java-links) - A list of useful Java frameworks, libraries, software and hello worlds examples
* [wasabeef/Blurry](https://github.com/wasabeef/Blurry) - Blurry is an easy blur library for Android
* [amitshekhariitbhu/RxJava2-Android-Samples](https://github.com/amitshekhariitbhu/RxJava2-Android-Samples) - RxJava 2 Android Examples - Migration From RxJava 1 to RxJava 2 - How to use RxJava 2 in Android
* [junit-team/junit5](https://github.com/junit-team/junit5) - ??? The 5th major version of the programmer-friendly testing framework for Java and the JVM
* [orhanobut/dialogplus](https://github.com/orhanobut/dialogplus) - Advanced dialog solution for android
* [btraceio/btrace](https://github.com/btraceio/btrace) - BTrace - a safe, dynamic tracing tool for the Java platform
* [frohoff/ysoserial](https://github.com/frohoff/ysoserial) - A proof-of-concept tool for generating payloads that exploit unsafe Java object deserialization.
* [Ramotion/folding-cell-android](https://github.com/Ramotion/folding-cell-android) - :octocat: ????  FoldingCell is a material design expanding content cell inspired by folding paper material made by @Ramotion
* [socketio/socket.io-client-java](https://github.com/socketio/socket.io-client-java) - Full-featured Socket.IO Client Library for Java, which is compatible with Socket.IO v1.0 and later.
* [hibernate/hibernate-orm](https://github.com/hibernate/hibernate-orm) - Hibernate's core Object/Relational Mapping functionality
* [wiremock/wiremock](https://github.com/wiremock/wiremock) - A tool for mocking HTTP services
* [ffay/lanproxy](https://github.com/ffay/lanproxy) - lanproxy??????????????????????????????????????????????????????????????????????????????????????????tcp??????????????????????????????tcp???????????????????????????????????????????????????????????????ssh????????????????????????http?????????https?????????socks5??????...??????????????????QQ??? 678776401
* [AriaLyy/Aria](https://github.com/AriaLyy/Aria) - ?????????????????????
* [mapstruct/mapstruct](https://github.com/mapstruct/mapstruct) - An annotation processor for generating type-safe bean mappers
* [JodaOrg/joda-time](https://github.com/JodaOrg/joda-time) - Joda-Time is the widely used replacement for the Java date and time classes prior to Java SE 8.
* [alibaba/transmittable-thread-local](https://github.com/alibaba/transmittable-thread-local) - ???? TransmittableThreadLocal (TTL), the missing Java??? std lib(simple & 0-dependency) for framework/middleware, provide an enhanced InheritableThreadLocal that transmits values between threads even using thread pooling components.
* [mcxiaoke/packer-ng-plugin](https://github.com/mcxiaoke/packer-ng-plugin) - ?????????Android???????????????100?????????????????????10??????
* [jOOQ/jOOQ](https://github.com/jOOQ/jOOQ) - jOOQ is the best way to write SQL in Java
* [raphw/byte-buddy](https://github.com/raphw/byte-buddy) - Runtime code generation for the Java virtual machine.
* [hazelcast/hazelcast](https://github.com/hazelcast/hazelcast) -  Open-source distributed computation and storage platform
* [trinodb/trino](https://github.com/trinodb/trino) - Official repository of Trino, the distributed SQL query engine for big data, formerly known as PrestoSQL (https://trino.io)
* [awsdocs/aws-doc-sdk-examples](https://github.com/awsdocs/aws-doc-sdk-examples) - Welcome to the AWS Code Examples Repository.  This repo contains code examples used in the AWS documentation, AWS SDK Developer Guides, and more. For more information, see the Readme.rst file below.
* [vavr-io/vavr](https://github.com/vavr-io/vavr) - v??vr (formerly called Javaslang) is a non-commercial, non-profit object-functional library that runs with Java 8+. It aims to reduce the lines of code and increase code quality.
* [gephi/gephi](https://github.com/gephi/gephi) - Gephi - The Open Graph Viz Platform
* [SplashCodes/JAViewer](https://github.com/SplashCodes/JAViewer) - ????????????????????????
* [981011512/--](https://github.com/981011512/--) - ????????????????????????????????????????????????????????????Parking system?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????id??????????????????????????????????????????????????????????????????????????????????????????????????????(??????????????????????????????????????????????????????????????????????????????????????????????????????)???????????????????????????????????????????????????????????????app????????????????????????(???????????????????????????????????????????????????????????????????????????)????????????????????????????????????????????????????????????app????????????????????????????????????????????? ???????????????????????????????????????java?????????oauth2+springboot2+dubble????????????mysql/mongodb/redis???????????????????????????netty4????????????ios???????????????????????????????????????vue????????????
* [auth0/java-jwt](https://github.com/auth0/java-jwt) - Java implementation of JSON Web Token (JWT)
* [spring-cloud/spring-cloud-netflix](https://github.com/spring-cloud/spring-cloud-netflix) - Integration with Netflix OSS components
* [nisrulz/android-tips-tricks](https://github.com/nisrulz/android-tips-tricks) - :ballot_box_with_check: [Cheatsheet] Tips and tricks for Android Development
* [ankidroid/Anki-Android](https://github.com/ankidroid/Anki-Android) - AnkiDroid: Anki flashcards on Android. Your secret trick to achieve superhuman information retention.
* [jankotek/mapdb](https://github.com/jankotek/mapdb) - MapDB provides concurrent Maps, Sets and Queues backed by disk storage or off-heap-memory. It is a fast and easy to use embedded Java database engine.
* [macrozheng/springcloud-learning](https://github.com/macrozheng/springcloud-learning) - ??????????????????????????????????????????Spring Cloud???????????????Spring Cloud Alibaba??????????????????Seata?????????Spring Cloud Greenwich???SpringBoot 2.1.7???22???????????????????????????32???Demo?????????????????????????????????
* [microg/GmsCore](https://github.com/microg/GmsCore) - Free implementation of Play Services
* [lettuce-io/lettuce-core](https://github.com/lettuce-io/lettuce-core) - Advanced Java Redis client for thread-safe sync, async, and reactive usage. Supports Cluster, Sentinel, Pipelining, and codecs.
* [puniverse/quasar](https://github.com/puniverse/quasar) - Fibers, Channels and Actors for the JVM
* [apache/hbase](https://github.com/apache/hbase) - Apache HBase
* [opensearch-project/OpenSearch](https://github.com/opensearch-project/OpenSearch) - ???? Open source distributed and RESTful search engine.
* [deathmarine/Luyten](https://github.com/deathmarine/Luyten) - An Open Source Java Decompiler Gui for Procyon
* [google/google-java-format](https://github.com/google/google-java-format) - Reformats Java source code to comply with Google Java Style.
* [2227324689/gpmall](https://github.com/2227324689/gpmall) - ??????????????????????????????-??????SpringBoot+Dubbo?????????????????????-????????????????????????????????????????????????????????????kafka???Elasticsearch
* [cglib/cglib](https://github.com/cglib/cglib) - cglib - Byte Code Generation Library is high level API to generate and transform Java byte code. It is used by AOP, testing, data access frameworks to generate dynamic proxy objects and intercept field access.
* [fuzhengwei/itstack-demo-design](https://github.com/fuzhengwei/itstack-demo-design) - :art: ?????????Java???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????22?????????????????????????????????????????????????????????????????????????????????(fustack)???????????????bugstack?????????????????????https://bugstack.cn
* [yasserg/crawler4j](https://github.com/yasserg/crawler4j) - Open Source Web Crawler for Java
* [awangdev/LintCode](https://github.com/awangdev/LintCode) - Java Solutions to problems on LintCode/LeetCode
* [bitcoinj/bitcoinj](https://github.com/bitcoinj/bitcoinj) - A library for working with Bitcoin
* [hansonwang99/Spring-Boot-In-Action](https://github.com/hansonwang99/Spring-Boot-In-Action) - Spring Boot ??????????????????
* [javagrowing/JGrowing](https://github.com/javagrowing/JGrowing) - Java is Growing up but not only Java???Java????????????????????????????????????Java???
* [zuihou/lamp-cloud](https://github.com/zuihou/lamp-cloud) - lamp-cloud ??????Jdk11 + SpringCloud + SpringBoot??????????????????????????????????????????????????????SaaS????????????????????? ??????RBAC??????????????????????????????Xss????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [zhanglei-workspace/shopping-management-system](https://github.com/zhanglei-workspace/shopping-management-system) - ??????????????????????????????????????????????????????...?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????Java???????????????????????????????????????Java???????????????????????????????????????????????????????????????????????????????????????????????????Java??????????????????????????????
* [kiegroup/drools](https://github.com/kiegroup/drools) - Drools is a rule engine, DMN engine and complex event processing (CEP) engine for Java.
* [apache/hive](https://github.com/apache/hive) - Apache Hive
* [apache/camel](https://github.com/apache/camel) - Apache Camel is an open source integration framework that empowers you to quickly and easily integrate various systems consuming or producing data.
* [Yalantis/Phoenix](https://github.com/Yalantis/Phoenix) - Phoenix Pull-to-Refresh
* [ZHENFENG13/spring-boot-projects](https://github.com/ZHENFENG13/spring-boot-projects) - ????????????????????? Spring Boot ?????????????????????????????????????????? Spring Boot ??????????????????????????? Spring Boot ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? web ?????????????????????????????????????????????????????????/????????????????????????/????????????????????????????????????????????? hello world ??????????????????????????????????????? Spring Boot ?????????
* [javaparser/javaparser](https://github.com/javaparser/javaparser) - Java 1-15 Parser and Abstract Syntax Tree for Java, including preview features to Java 13
* [stleary/JSON-java](https://github.com/stleary/JSON-java) - A reference implementation of a JSON package in Java.
* [iNPUTmice/Conversations](https://github.com/iNPUTmice/Conversations) - Conversations is an open source XMPP/Jabber client for Android
* [rengwuxian/RxJavaSamples](https://github.com/rengwuxian/RxJavaSamples) - RxJava 2 ??? Retrofit ????????????????????????????????????????????????
* [ronmamo/reflections](https://github.com/ronmamo/reflections) - Java runtime metadata analysis
* [objectbox/objectbox-java](https://github.com/objectbox/objectbox-java) - ObjectBox is a superfast lightweight database for objects
* [phishman3579/java-algorithms-implementation](https://github.com/phishman3579/java-algorithms-implementation) - Algorithms and Data Structures implemented in Java
* [cabaletta/baritone](https://github.com/cabaletta/baritone) - google maps for block game
* [yuliskov/SmartTubeNext](https://github.com/yuliskov/SmartTubeNext) - Ad free app for watching tube videos on Android TV boxes
* [CalebFenton/simplify](https://github.com/CalebFenton/simplify) - Android virtual machine and deobfuscator
* [chewiebug/GCViewer](https://github.com/chewiebug/GCViewer) - Fork of tagtraum industries' GCViewer. Tagtraum stopped development in 2008, I aim to improve support for Sun's / Oracle's java 1.6+ garbage collector logs (including G1 collector)
* [coobird/thumbnailator](https://github.com/coobird/thumbnailator) - Thumbnailator - a thumbnail generation library for Java
* [brianway/java-learning](https://github.com/brianway/java-learning) - ??????????????????????????? Java ?????????????????????????????????????????????????????? Java SE ??? Java Web
* [bisq-network/bisq](https://github.com/bisq-network/bisq) - A decentralized bitcoin exchange network
* [oldmanpushcart/greys-anatomy](https://github.com/oldmanpushcart/greys-anatomy) - Java????????????
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
* [mercyblitz/tech-weekly](https://github.com/mercyblitz/tech-weekly) - ???????????????????????????
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
* [saysky/ForestBlog](https://github.com/saysky/ForestBlog) - ?????????????????????SSM(Spring+SpringMVC+Mybatis)????????????
* [oracle/opengrok](https://github.com/oracle/opengrok) - OpenGrok is a fast and usable source code search and cross reference engine, written in Java
* [mpusher/mpush](https://github.com/mpusher/mpush) - MPush??????????????????????????????
* [Col-E/Recaf](https://github.com/Col-E/Recaf) - The modern Java bytecode editor
* [JSQLParser/JSqlParser](https://github.com/JSQLParser/JSqlParser) - JSqlParser parses an SQL statement and translate it into a hierarchy of Java classes. The generated hierarchy can be navigated using the Visitor Pattern
* [knowm/XChange](https://github.com/knowm/XChange) - XChange is a Java library providing a streamlined API for interacting with 60+ Bitcoin and Altcoin exchanges providing a consistent interface for trading and accessing market data.
* [jboss-javassist/javassist](https://github.com/jboss-javassist/javassist) - Java bytecode engineering toolkit
* [RedSpider1/concurrent](https://github.com/RedSpider1/concurrent) - ??????RedSpider??????????????????????????????Java????????????????????????
* [traccar/traccar](https://github.com/traccar/traccar) - Traccar GPS Tracking System
* [promeG/TinyPinyin](https://github.com/promeG/TinyPinyin) - ?????????Java???Android???????????????????????????????????????????????????
* [spring-cloud/spring-cloud-gateway](https://github.com/spring-cloud/spring-cloud-gateway) - A Gateway built on Spring Framework 5.x and Spring Boot 2.x providing routing and more.
* [remkop/picocli](https://github.com/remkop/picocli) - Picocli is a modern framework for building powerful, user-friendly, GraalVM-enabled command line apps with ease. It supports colors, autocompletion, subcommands, and more.  In 1 source file so apps can include as source & avoid adding a dependency. Written in Java, usable from Groovy, Kotlin, Scala, etc.
* [liuyubobobo/Play-with-Algorithms](https://github.com/liuyubobobo/Play-with-Algorithms) - Codes of my MOOC Course <Play with Algorithms>, Both in C++ and Java language. Updated contents and practices are also included. ???????????????????????????????????????????????????????????????????????????C++???Java??????????????????????????????????????????????????????????????????????????????????????????
* [networknt/light-4j](https://github.com/networknt/light-4j) - A fast, lightweight and more productive microservices framework
* [zlt2000/microservices-platform](https://github.com/zlt2000/microservices-platform) - ??????SpringBoot2.x???SpringCloud???SpringCloudAlibaba??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????RBAC???jwt???oauth2?????????????????????????????????????????????????????????????????????????????????B??????C??????????????????CI/CD?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????:????????????????????????????????????????????????????????????sql???????????????????????????????????????Redis???????????????????????????????????????????????????????????????????????????????????????????????????
* [sherxon/AlgoDS](https://github.com/sherxon/AlgoDS) - Implementation of Algorithms and Data Structures, Problems and Solutions
* [subhra74/xdm](https://github.com/subhra74/xdm) - Powerfull download accelerator and video downloader
* [eclipse/jetty.project](https://github.com/eclipse/jetty.project) - Eclipse Jetty?? - Web Container & Clients - supports HTTP/2, HTTP/1.1, HTTP/1.0, websocket, servlets, and more
* [PowerJob/PowerJob](https://github.com/PowerJob/PowerJob) - Enterprise job scheduling middleware with distributed computing ability.
* [crate/crate](https://github.com/crate/crate) - CrateDB is a distributed SQL database that makes it simple to store and analyze massive amounts of machine data in real-time.
* [MovingBlocks/Terasology](https://github.com/MovingBlocks/Terasology) - Terasology - open source voxel world
* [kevinsawicki/http-request](https://github.com/kevinsawicki/http-request) - Java HTTP Request Library
* [ragunathjawahar/android-saripaar](https://github.com/ragunathjawahar/android-saripaar) - UI form validation library for Android
* [qunarcorp/bistoury](https://github.com/qunarcorp/bistoury) - Bistoury??????????????????java????????????????????????????????????????????????????????????????????????
* [micrometer-metrics/micrometer](https://github.com/micrometer-metrics/micrometer) - An application metrics facade for the most popular monitoring tools. Think SLF4J, but for metrics.
* [alibaba/jetcache](https://github.com/alibaba/jetcache) - JetCache is a Java cache framework.
* [fyhertz/libstreaming](https://github.com/fyhertz/libstreaming) - A solution for streaming H.264, H.263, AMR, AAC using RTP on Android
* [chenBingX/SuperTextView](https://github.com/chenBingX/SuperTextView) - Hi???Developer???Welcome to use SuperTextView ???
* [NotFound9/interviewGuide](https://github.com/NotFound9/interviewGuide) - ????????????????????????????????????Java?????????JVM???????????????mysql???redis??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????http://notfound9.github.io/interviewGuide/
* [jfinal/jfinal](https://github.com/jfinal/jfinal) - JAVA WEB + ORM Framework
* [DiUS/java-faker](https://github.com/DiUS/java-faker) - Brings the popular ruby faker gem to Java
* [fishercoder1534/Leetcode](https://github.com/fishercoder1534/Leetcode) - Solutions to LeetCode problems; updated daily. Subscribe to my YouTube channel for more.
* [jbloch/effective-java-3e-source-code](https://github.com/jbloch/effective-java-3e-source-code) - The source code from the third edition of Effective Java, with minor additions as necessary to make it runnable.
* [h2database/h2database](https://github.com/h2database/h2database) - H2 is an embeddable RDBMS written in Java.
* [WritingMinds/ffmpeg-android-java](https://github.com/WritingMinds/ffmpeg-android-java) - Android java library for FFmpeg binary compiled using https://github.com/writingminds/ffmpeg-android
* [alibaba/QLExpress](https://github.com/alibaba/QLExpress) - QLExpress is a powerful, lightweight, dynamic language for the Java platform aimed at improving developers??? productivity in different business scenes.
* [anggrayudi/android-hidden-api](https://github.com/anggrayudi/android-hidden-api) - A library that provides access to Android hidden APIs and internal resources.
* [spockframework/spock](https://github.com/spockframework/spock) - The Enterprise-ready testing and specification framework.
* [requery/requery](https://github.com/requery/requery) - requery - modern SQL based query & persistence for Java / Kotlin / Android
* [jacoco/jacoco](https://github.com/jacoco/jacoco) - :microscope: Java Code Coverage Library
* [guoguibing/librec](https://github.com/guoguibing/librec) - LibRec: A Leading Java Library for Recommender Systems, see
* [uber/NullAway](https://github.com/uber/NullAway) - A tool to help eliminate NullPointerExceptions (NPEs) in your Java code with low build-time overhead
* [immutables/immutables](https://github.com/immutables/immutables) - Annotation processor to create immutable objects and builders. Feels like Guava's immutable collections but for regular value objects. JSON, Jackson, Gson, JAX-RS integrations included
* [lenve/JavaEETest](https://github.com/lenve/JavaEETest) - Spring???SpringMVC???MyBatis???Spring Boot??????
* [Red5/red5-server](https://github.com/Red5/red5-server) - Red5 Server core
* [supertokens/supertokens-core](https://github.com/supertokens/supertokens-core) - Open source alternative to Auth0 / Firebase Auth / AWS Cognito
* [jasonross/Nuwa](https://github.com/jasonross/Nuwa) - Nuwa, pure java implementation, can hotfix your android application.
* [mxdldev/android-mvp-mvvm-flytour](https://github.com/mxdldev/android-mvp-mvvm-flytour) - ???????????? FlyTour???Android MVVM+MVP+Dagger2+Retrofit+RxJava+?????????+??????????????????????????????+???????????????+?????????Android?????????????????????????????????????????????????????????????????????????????????????????????5.0????????????????????????gradle????????????????????????5.0???????????????????????????VirtualAPK?????????????????????5.0????????????Java???????????????5.0????????????Kotlin??????????????????????????????MVVM???MVP??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????Android????????????Android????????????Android MVP?????????Android MVVM?????????????????????????????????????????????????????????App???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????lib_common?????????util??????????????????????????????
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
* [jagrosh/MusicBot](https://github.com/jagrosh/MusicBot) - ???? A Discord music bot that's easy to set up and run yourself!
* [tronprotocol/java-tron](https://github.com/tronprotocol/java-tron) - Java implementation of the Tron whitepaper
* [CrawlScript/WebCollector](https://github.com/CrawlScript/WebCollector) - WebCollector is an open source web crawler framework based on Java.It provides some simple interfaces for crawling the Web,you can setup a multi-threaded web crawler in less than 5 minutes.
* [nanchen2251/RxJava2Examples](https://github.com/nanchen2251/RxJava2Examples) - :fire:RxJava2 Examples ?????? ??????????????? RxJava1 ?????? RxJava2????????? RxJava2 ?????????????????? Demo???https://github.com/nanchen2251/RxJava2Examples
* [apache/calcite](https://github.com/apache/calcite) - Apache Calcite
* [szerhusenBC/jwt-spring-security-demo](https://github.com/szerhusenBC/jwt-spring-security-demo) - A demo for using JWT (Json Web Token) with Spring Security and Spring Boot 2
* [AweiLoveAndroid/CommonDevKnowledge](https://github.com/AweiLoveAndroid/CommonDevKnowledge) - :octocat::fire: :star2::star::star::star: :star:  ???????????????BAT??????Android?????????????????????????????????Android??????????????????????????????????????????????????????????????????????????????????????????
* [jeecgboot/JimuReport](https://github.com/jeecgboot/JimuReport) - ????????????????????????????????????excel??????????????????????????????????????????????????????: ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [jMonkeyEngine/jmonkeyengine](https://github.com/jMonkeyEngine/jmonkeyengine) - A complete 3-D game development suite written in Java.
* [awaitility/awaitility](https://github.com/awaitility/awaitility) - Awaitility is a small Java DSL for synchronizing asynchronous operations
* [killme2008/aviatorscript](https://github.com/killme2008/aviatorscript) - A high performance scripting language hosted on the JVM.
* [eclipse-openj9/openj9](https://github.com/eclipse-openj9/openj9) - Eclipse OpenJ9: A Java Virtual Machine for OpenJDK that's optimized for small footprint, fast start-up, and high throughput.   Builds on Eclipse OMR (https://github.com/eclipse/omr) and combines with the Extensions for OpenJDK for OpenJ9 repo.
* [FinalTeam/RxGalleryFinal](https://github.com/FinalTeam/RxGalleryFinal) - ????????????????????????/??????????????????????????????????????????????????????????????????????????????
* [jtablesaw/tablesaw](https://github.com/jtablesaw/tablesaw) - Java dataframe and visualization library
* [Mojang/brigadier](https://github.com/Mojang/brigadier) - Brigadier is a command parser & dispatcher, designed and developed for Minecraft: Java Edition.
* [florent37/ExpectAnim](https://github.com/florent37/ExpectAnim) - Describe your animation and run !
* [google/binnavi](https://github.com/google/binnavi) - BinNavi is a binary analysis IDE that allows to inspect, navigate, edit and annotate control flow graphs and call graphs of disassembled code.
* [RipMeApp/ripme](https://github.com/RipMeApp/ripme) - Downloads albums in bulk
* [rubenlagus/TelegramBots](https://github.com/rubenlagus/TelegramBots) - Java library to create bots using Telegram Bots API
* [Yalantis/GuillotineMenu-Android](https://github.com/Yalantis/GuillotineMenu-Android) - Neat library, that provides a simple way to implement guillotine-styled animation
* [youlookwhat/DesignPattern](https://github.com/youlookwhat/DesignPattern) - ???? Java 23????????????????????????
* [bastillion-io/Bastillion](https://github.com/bastillion-io/Bastillion) - Bastillion is a web-based SSH console that centrally manages administrative access to systems. Web-based administration is combined with management and distribution of user's public SSH keys.
* [pedrovgs/Algorithms](https://github.com/pedrovgs/Algorithms) - Solutions for some common algorithm problems written in Java.
* [lizhangqu/CoreLink](https://github.com/lizhangqu/CoreLink) - Android ????????????????????????
* [nextcloud/android](https://github.com/nextcloud/android) - ???? Nextcloud Android app
* [bitcoin-wallet/bitcoin-wallet](https://github.com/bitcoin-wallet/bitcoin-wallet) - Bitcoin Wallet app for your Android device. Standalone Bitcoin node, no centralized backend required.
* [apache/curator](https://github.com/apache/curator) - Apache Curator
* [chanjarster/weixin-java-tools](https://github.com/chanjarster/weixin-java-tools) - ???????????????????????????Java SDK
* [DV8FromTheWorld/JDA](https://github.com/DV8FromTheWorld/JDA) - Java wrapper for the popular chat & VOIP service: Discord https://discord.com
* [sofastack/sofa-jraft](https://github.com/sofastack/sofa-jraft) - A production-grade java implementation of RAFT consensus algorithm.
* [r0adkll/Slidr](https://github.com/r0adkll/Slidr) - Easily add slide to dismiss functionality to an Activity
* [spring-projects/spring-loaded](https://github.com/spring-projects/spring-loaded) - Java agent that enables class reloading in a running JVM
* [rememberber/WePush](https://github.com/rememberber/WePush) - ?????????????????????????????????????????????????????????????????????-????????????????????????-????????????????????????????????????????????????/??????????????????????????????????????????????????????????????? ???????????????????????????????????????E-Mail???HTTP???????????????????????????????????????????????????????????????????????????????????????
* [kabouzeid/Phonograph](https://github.com/kabouzeid/Phonograph) - A material designed music player for Android
* [brianway/webporter](https://github.com/brianway/webporter) - ?????? webmagic ??? Java ????????????
* [apache/logging-log4j2](https://github.com/apache/logging-log4j2) - Apache Log4j 2 is an upgrade to Log4j that provides significant improvements over its predecessor, Log4j 1.x, and provides many of the improvements available in Logback while fixing some inherent problems in Logback's architecture.
* [spotify/docker-maven-plugin](https://github.com/spotify/docker-maven-plugin) - INACTIVE: A maven plugin for Docker
* [Twitter4J/Twitter4J](https://github.com/Twitter4J/Twitter4J) - Twitter4J is an open-sourced, mavenized and Google App Engine safe Java library for the Twitter API which is released under the Apache License 2.0.
* [spotbugs/spotbugs](https://github.com/spotbugs/spotbugs) - SpotBugs is FindBugs' successor. A tool for static analysis to look for bugs in Java code.
* [geoserver/geoserver](https://github.com/geoserver/geoserver) - Official GeoServer repository
* [AxonFramework/AxonFramework](https://github.com/AxonFramework/AxonFramework) - Framework for Evolutionary Event-Driven Microservices on the JVM
* [spring-projects/spring-data-elasticsearch](https://github.com/spring-projects/spring-data-elasticsearch) - Provide support to increase developer productivity in Java when using Elasticsearch. Uses familiar Spring concepts such as a template classes for core API usage and lightweight repository style data access.
* [spotify/dockerfile-maven](https://github.com/spotify/dockerfile-maven) - MATURE: A set of Maven tools for dealing with Dockerfiles
* [yingLanNull/ShadowImageView](https://github.com/yingLanNull/ShadowImageView) - ?????????????????????????????????????????????????????????????????????????  It can change color according to the picture, more delicate shadow effect
* [oracle/helidon](https://github.com/oracle/helidon) - Java libraries for writing microservices
* [real-logic/simple-binary-encoding](https://github.com/real-logic/simple-binary-encoding) - Simple Binary Encoding (SBE) - High Performance Message Codec
* [AdoptOpenJDK/jitwatch](https://github.com/AdoptOpenJDK/jitwatch) - Log analyser / visualiser for Java HotSpot JIT compiler. Inspect inlining decisions, hot methods, bytecode, and assembly. View results in the JavaFX user interface.
* [shopizer-ecommerce/shopizer](https://github.com/shopizer-ecommerce/shopizer) - Shopizer java e-commerce software
* [VerbalExpressions/JavaVerbalExpressions](https://github.com/VerbalExpressions/JavaVerbalExpressions) - Java regular expressions made easy.
* [williamfiset/DEPRECATED-data-structures](https://github.com/williamfiset/DEPRECATED-data-structures) - A collection of powerful data structures
* [jOOQ/jOOR](https://github.com/jOOQ/jOOR) -  jOOR - Fluent Reflection in Java jOOR is a very simple fluent API that gives access to your Java Class structures in a more intuitive way. The JDK's reflection APIs are hard and verbose to use. Other languages have much simpler constructs to access type meta information at runtime. Let us make Java reflection better.
* [JsonChao/Awesome-WanAndroid](https://github.com/JsonChao/Awesome-WanAndroid) - :zap:???????????????????????????????????? http://www.wanandroid.com/ ?????????????????????????????????????????????QAQn(*?????????*)n
* [OpenHFT/Chronicle-Queue](https://github.com/OpenHFT/Chronicle-Queue) - Micro second messaging that stores everything to disk
* [Ramotion/paper-onboarding-android](https://github.com/Ramotion/paper-onboarding-android) - :octocat: PaperOnboarding is a material design slider made by @Ramotion
* [javamelody/javamelody](https://github.com/javamelody/javamelody) - JavaMelody : monitoring of JavaEE applications
* [balysv/material-menu](https://github.com/balysv/material-menu) - Animations for Android L drawer, back, dismiss and check icons
* [Krupen/FabulousFilter](https://github.com/Krupen/FabulousFilter) - Android library to animate Floating Action Button to Bottom Sheet Dialog and vice-versa
* [RoaringBitmap/RoaringBitmap](https://github.com/RoaringBitmap/RoaringBitmap) - A better compressed bitset in Java
* [sannies/mp4parser](https://github.com/sannies/mp4parser) - A Java API to read, write and create MP4 files
* [FudanNLP/fnlp](https://github.com/FudanNLP/fnlp) - ????????????????????????????????? Toolkit for Chinese natural language processing
* [kiegroup/optaplanner](https://github.com/kiegroup/optaplanner) - AI constraint solver in Java to optimize the vehicle routing problem, employee rostering, task assignment, maintenance scheduling, conference scheduling and other planning problems.
* [javaee-samples/javaee7-samples](https://github.com/javaee-samples/javaee7-samples) - Java EE 7 Samples
* [Qihoo360/ArgusAPM](https://github.com/Qihoo360/ArgusAPM) - Powerful, comprehensive (Android) application performance management platform. 360??????????????????????????????
* [mongodb/mongo-java-driver](https://github.com/mongodb/mongo-java-driver) - The Java driver for MongoDB
* [jetlinks/jetlinks-community](https://github.com/jetlinks/jetlinks-community) - JetLinks  ??????Java8,Spring Boot 2.x ,WebFlux,Netty,Vert.x,Reactor?????????, ??????????????????????????????????????????????????????????????????????????????,????????????,????????????,???????????????????????????????????????,???????????????(TCP,MQTT,UDP,CoAP,HTTP???),???????????????????????????,??????????????????????????????????????????????????????????????????,????????????,????????????,???????????????????????????,???????????????????????????????????????????????????????????????????????????
* [igniterealtime/Openfire](https://github.com/igniterealtime/Openfire) - An XMPP server licensed under the Open Source Apache License.
* [nutzam/nutz](https://github.com/nutzam/nutz) - Nutz -- Web Framework(Mvc/Ioc/Aop/Dao/Json) for ALL Java developer
* [ZHENFENG13/My-Blog](https://github.com/ZHENFENG13/My-Blog) - :palm_tree::octocat:A simple & beautiful blogging system implemented with spring-boot & thymeleaf & mybatis My Blog ?????? SpringBoot + Mybatis + Thymeleaf ?????????????????? Java ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [camunda/camunda-bpm-platform](https://github.com/camunda/camunda-bpm-platform) - Flexible framework for workflow and decision automation with BPMN and DMN. Integration with Spring, Spring Boot, CDI.
* [fuzhengwei/small-spring](https://github.com/fuzhengwei/small-spring) - ??????? Spring ?????????????????????????????? Spring ????????????????????????????????????????????? Spring ??????????????? Spring ????????????????????????????????????????????? Spring ?????????????????????????????????????????????????????????????????????????????????????????????????????????IOC???AOP???Bean?????????????????????????????????????????????????????????????????????
* [JabRef/jabref](https://github.com/JabRef/jabref) - Graphical Java application for managing BibTeX and biblatex (.bib) databases
* [tdebatty/java-string-similarity](https://github.com/tdebatty/java-string-similarity) - Implementation of various string similarity and distance algorithms: Levenshtein, Jaro-winkler, n-Gram, Q-Gram, Jaccard index, Longest Common Subsequence edit distance, cosine similarity ...
* [AlmasB/FXGL](https://github.com/AlmasB/FXGL) - Java / JavaFX / Kotlin Game Library (Engine)
* [VictorAlbertos/RxCache](https://github.com/VictorAlbertos/RxCache) - Reactive caching library for Android and Java
* [square/tape](https://github.com/square/tape) - A lightning fast, transactional, file-based FIFO for Android and Java.
* [fesh0r/fernflower](https://github.com/fesh0r/fernflower) - Unofficial mirror of FernFlower Java decompiler (All pulls should be submitted upstream)
* [nayuki/QR-Code-generator](https://github.com/nayuki/QR-Code-generator) - High-quality QR Code generator library in Java, TypeScript/JavaScript, Python, Rust, C++, C.
* [liyiorg/weixin-popular](https://github.com/liyiorg/weixin-popular) - ??????SDK  JAVA  (?????????????????????????????? ??????????????? ???????????????)
* [RodneyShag/HackerRank_solutions](https://github.com/RodneyShag/HackerRank_solutions) - 317 efficient solutions to HackerRank problems
* [charles2gan/GDA-android-reversing-Tool](https://github.com/charles2gan/GDA-android-reversing-Tool) - GDA is a new fast and powerful decompiler in C++(working without Java VM) for the APK, DEX, ODEX, OAT, JAR, AAR, and CLASS file. which supports malicious behavior detection, privacy leaking detection, vulnerability detection, path solving, packer identification, variable tracking, deobfuscation, python&java scripts, device memory extraction, data decryption, and encryption,??etc.
* [cucumber/cucumber-jvm](https://github.com/cucumber/cucumber-jvm) - Cucumber for the JVM
* [google/truth](https://github.com/google/truth) - Fluent assertions for Java and Android
* [s4kibs4mi/java-developer-roadmap](https://github.com/s4kibs4mi/java-developer-roadmap) - Roadmap to becoming a Java developer in 2021
* [apache/incubator-linkis](https://github.com/apache/incubator-linkis) - Linkis helps easily connect to various back-end computation/storage engines(Spark, Python, TiDB...), exposes various interfaces(REST, JDBC, Java ...), with multi-tenancy, high performance, and resource control.
* [JPressProjects/jpress](https://github.com/JPressProjects/jpress) - JPress??????????????? Java ??????????????????????????????????????? 10w+ ???????????? JPress ????????????????????????????????????????????????200+??????????????????????????????+????????????
* [federicoiosue/Omni-Notes](https://github.com/federicoiosue/Omni-Notes) - Open source note-taking application for Android
* [balysv/material-ripple](https://github.com/balysv/material-ripple) - Android L Ripple effect wrapper for Views
* [Sayi/poi-tl](https://github.com/Sayi/poi-tl) - Generate awesome word(docx) with template
* [vdurmont/emoji-java](https://github.com/vdurmont/emoji-java) - The missing emoji library for Java :heart:
* [liweiwei1419/LeetCode-Solutions-in-Good-Style](https://github.com/liweiwei1419/LeetCode-Solutions-in-Good-Style) - ???????????????????????????????????????????????????
* [EngineHub/WorldEdit](https://github.com/EngineHub/WorldEdit) - ??????? Minecraft map editor and mod
* [xtuhcy/gecco](https://github.com/xtuhcy/gecco) - Easy to use lightweight web crawler????????????????????????????????????
* [diffplug/spotless](https://github.com/diffplug/spotless) - Keep your code spotless
* [JetBrains/skija](https://github.com/JetBrains/skija) - Java bindings for Skia
* [qos-ch/logback](https://github.com/qos-ch/logback) - The reliable, generic, fast and flexible logging framework for Java.
* [LinShunKang/MyPerf4J](https://github.com/LinShunKang/MyPerf4J) - High performance Java APM. Powered by ASM. Try it. Test it. If you feel its better, use it.
* [deepjavalibrary/djl](https://github.com/deepjavalibrary/djl) - An Engine-Agnostic Deep Learning Framework in Java
* [apache/nutch](https://github.com/apache/nutch) - Apache Nutch is an extensible and scalable web crawler
* [Ramotion/cardslider-android](https://github.com/Ramotion/cardslider-android) - :octocat: ???? Cardslider is a material design UI controller that allows you to swipe through cards with pictures and accompanying descriptions.
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
* [Zhaoss/WeiXinRecordedDemo](https://github.com/Zhaoss/WeiXinRecordedDemo) - ?????????????????????UI, ??????ffmpeg?????????????????????
* [timusus/Shuttle](https://github.com/timusus/Shuttle) - Shuttle Music Player
* [LibrePDF/OpenPDF](https://github.com/LibrePDF/OpenPDF) - OpenPDF is a free Java library for creating and editing PDF files with a LGPL and MPL open source license. OpenPDF is based on a fork of iText. We welcome contributions from other developers. Please feel free to submit pull-requests and bugreports to this GitHub repository. ???
* [atomix/atomix](https://github.com/atomix/atomix) - A reactive Java framework for building fault-tolerant distributed systems
* [steelkiwi/cropiwa](https://github.com/steelkiwi/cropiwa) - ???? Configurable Custom Crop widget for Android
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
* [egzosn/pay-java-parent](https://github.com/egzosn/pay-java-parent) - ?????????????????????????????????Java???????????????.?????????????????????????????????????????????????????????????????????,?????????,??????,??????,??????,????????????paypal,payoneer(P????????????)????????????app,??????,??????????????????????????????????????????????????????,????????????,??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ???????????????????????????????????????SDK?????????????????????Web?????????????????????maven???gradle??????????????????????????????SDK????????????????????????????????????
* [Ramotion/expanding-collection-android](https://github.com/Ramotion/expanding-collection-android) - :octocat: ExpandingCollection is a material design card peek/pop controller. Android UI Library made by @Ramotion
* [jeecgboot/jeecg](https://github.com/jeecgboot/jeecg) - JEECG?????????????????????????????????J2EE???????????????????????????????????????????????????????????????????????????????????????????????????????????????(Online Coding??????(???????????????) - > ????????????????????? - > ??????MERGE????????????)??? ??????????????????Java??????90%???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [hierynomus/sshj](https://github.com/hierynomus/sshj) - ssh, scp and sftp for java
* [apache/avro](https://github.com/apache/avro) - Apache Avro is a data serialization system.
* [huaban/jieba-analysis](https://github.com/huaban/jieba-analysis) - ????????????(java???)
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
* [HelloWorld521/Java](https://github.com/HelloWorld521/Java) - java??????????????????
* [Yalantis/StarWars.Android](https://github.com/Yalantis/StarWars.Android) - This component implements transition animation to crumble view into tiny pieces.
* [DozerMapper/dozer](https://github.com/DozerMapper/dozer) - Dozer is a Java Bean to Java Bean mapper that recursively copies data from one object to another.
* [BruceEckel/OnJava8-Examples](https://github.com/BruceEckel/OnJava8-Examples) - Code Examples for the book "On Java 8"
* [moquette-io/moquette](https://github.com/moquette-io/moquette) - Java MQTT lightweight broker
* [anitaa1990/Android-Cheat-sheet](https://github.com/anitaa1990/Android-Cheat-sheet) - Cheat Sheet for Android Interviews
* [ninjaframework/ninja](https://github.com/ninjaframework/ninja) - Ninja is a full stack web framework for Java. Rock solid, fast and super productive.
* [jOOQ/jOOL](https://github.com/jOOQ/jOOL) - jOO?? - The Missing Parts in Java 8 jOO?? improves the JDK libraries in areas where the Expert Group's focus was elsewhere. It adds tuple support, function support, and a lot of additional functionality around sequential Streams. The JDK 8's main efforts (default methods, lambdas, and the Stream API) were focused around maintaining backwards compatibility and implementing a functional API for parallelism.
* [airsonic/airsonic](https://github.com/airsonic/airsonic) -  :satellite: :cloud: :notes:Airsonic, a Free and Open Source community driven media server (fork of Subsonic and Libresonic)
* [liuyubobobo/Play-with-Data-Structures](https://github.com/liuyubobobo/Play-with-Data-Structures) - Codes of my MOOC Course <Play Data Structures in Java>. Updated contents and practices are also included. ??????????????????????????????Java???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [boylegu/SpringBoot-vue](https://github.com/boylegu/SpringBoot-vue) - A example demo base SpringBooot with vueJS2.x + webpack2.x as Java full stack web practice
* [TakahikoKawasaki/nv-websocket-client](https://github.com/TakahikoKawasaki/nv-websocket-client) - High-quality WebSocket client implementation in Java.
* [scalad/Note](https://github.com/scalad/Note) - ??????Java?????????????????????????????????????????????????????????????????????????????????
* [Ramotion/garland-view-android](https://github.com/Ramotion/garland-view-android) - :octocat: ??? GarlandView seamlessly transitions between multiple lists of content. Made by @Ramotion
* [Yalantis/FlipViewPager.Draco](https://github.com/Yalantis/FlipViewPager.Draco) - This project aims to provide a working page flip implementation for usage in ListView.
* [dunwu/javacore](https://github.com/dunwu/javacore) - :coffee: JavaCore ?????? Java ??????????????????????????????
* [torakiki/pdfsam](https://github.com/torakiki/pdfsam) - PDFsam, a desktop application to extract pages, split, merge, mix and rotate PDF files
* [Athou/commafeed](https://github.com/Athou/commafeed) - Google Reader inspired self-hosted RSS reader.
* [uber/piranha](https://github.com/uber/piranha) - A tool for refactoring code related to feature flag APIs
* [shyiko/mysql-binlog-connector-java](https://github.com/shyiko/mysql-binlog-connector-java) - MySQL Binary Log connector
* [LogNet/grpc-spring-boot-starter](https://github.com/LogNet/grpc-spring-boot-starter) - Spring Boot starter module for gRPC  framework.
* [eclipse/eclipse-collections](https://github.com/eclipse/eclipse-collections) - Eclipse Collections is a collections framework for Java with optimized data structures and a rich, functional and fluent API.
* [konsoletyper/teavm](https://github.com/konsoletyper/teavm) - Compiler of Java bytecode to JavaScript
* [ysc/QuestionAnsweringSystem](https://github.com/ysc/QuestionAnsweringSystem) - QuestionAnsweringSystem?????????Java??????????????????????????????????????????????????????????????????????????????
* [airbnb/AirMapView](https://github.com/airbnb/AirMapView) - A view abstraction to provide a map user interface with various underlying map providers
* [syncthing/syncthing-android](https://github.com/syncthing/syncthing-android) - Wrapper of syncthing for Android.
* [bonigarcia/webdrivermanager](https://github.com/bonigarcia/webdrivermanager) - Automated driver management and Docker builder for Selenium WebDriver
* [zhegexiaohuozi/SeimiCrawler](https://github.com/zhegexiaohuozi/SeimiCrawler) - ??????????????????????????????????????????SpringBoot???Java????????????;An agile, distributed crawler framework.
* [Ramotion/circle-menu-android](https://github.com/Ramotion/circle-menu-android) - :octocat: ?????? CircleMenu is a simple, elegant UI menu with a circular layout and material design animations. Android UI library made by @Ramotion
* [qiujiayu/AutoLoadCache](https://github.com/qiujiayu/AutoLoadCache) -   AutoLoadCache ?????????AOP+Annotation???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [hekailiang/squirrel](https://github.com/hekailiang/squirrel) - squirrel-foundation is a State Machine library, which provided a lightweight, easy use, type safe and programmable state machine implementation for Java.
* [amaembo/streamex](https://github.com/amaembo/streamex) - Enhancing Java Stream API
* [qos-ch/slf4j](https://github.com/qos-ch/slf4j) - Simple Logging Facade for Java
* [OryxProject/oryx](https://github.com/OryxProject/oryx) - Oryx 2: Lambda architecture on Apache Spark, Apache Kafka for real-time large scale machine learning
* [xiaojieonly/Ehviewer_CN_SXJ](https://github.com/xiaojieonly/Ehviewer_CN_SXJ) - ehviewer??????????????????????????????
* [julian-klode/dns66](https://github.com/julian-klode/dns66) - DNS-based Host Blocker (and lightweight ad blocker) for Android
* [kanwangzjm/funiture](https://github.com/kanwangzjm/funiture) - ????????????????????? Java???????????????????????????????????????http://coding.imooc.com/class/195.html Java????????????????????????????????????http://coding.imooc.com/class/149.html github: https://github.com/kanwangzjm/funiture, spring??????????????????????????????????????????????????????????????????qps?????????sql??????(??????)??????????????????????????????????????????????????????
* [qdrzwd/VideoRecorder](https://github.com/qdrzwd/VideoRecorder) - android??????????????????????????????????????????????????????????????????????????????????????????
* [notnoop/java-apns](https://github.com/notnoop/java-apns) - Java Apple Push Notification Service Provider
* [a466350665/smart-sso](https://github.com/a466350665/smart-sso) - springboot SSO ???????????????OAuth2???????????????App????????????????????????
* [redsolution/xabber-android](https://github.com/redsolution/xabber-android) - Open-source XMPP client for Android
* [connectbot/connectbot](https://github.com/connectbot/connectbot) - ConnectBot is the first SSH client for Android.
* [buchen/portfolio](https://github.com/buchen/portfolio) - A simple tool to calculate the overall performance of an investment portfolio.
* [mabe02/lanterna](https://github.com/mabe02/lanterna) - Java library for creating text-based GUIs
* [zq2599/blog_demos](https://github.com/zq2599/blog_demos) - CSDN??????????????????????????????github???????????????????????????????????????????????????????????????????????????????????????????????????Java???Docker???Kubernetes???DevOPS?????????
* [find-sec-bugs/find-sec-bugs](https://github.com/find-sec-bugs/find-sec-bugs) - The SpotBugs plugin for security audits of Java web applications and Android applications. (Also work with Kotlin, Groovy and Scala projects)
* [sanluan/PublicCMS](https://github.com/sanluan/PublicCMS) - ?????????java cms??????????????????????????????????????????????????????????????????????????????PV???????????????????????????????????????; ????????????????????????0.0002%?????????????????????????????????????????????????????????????????????????????????CMS??????
* [apache/servicecomb-java-chassis](https://github.com/apache/servicecomb-java-chassis) - ServiceComb Java Chassis is a Software Development Kit (SDK) for rapid development of microservices in Java, providing service registration, service discovery, dynamic routing, and service management features
* [yaphone/itchat4j](https://github.com/yaphone/itchat4j) - itchat4j -- ???Java??????????????????????????????
* [spring-cloud/spring-cloud-config](https://github.com/spring-cloud/spring-cloud-config) - External configuration (server and client) for Spring Cloud
* [HotswapProjects/HotswapAgent](https://github.com/HotswapProjects/HotswapAgent) - Java unlimited redefinition of classes at runtime.
* [protostuff/protostuff](https://github.com/protostuff/protostuff) - Java serialization library, proto compiler, code generator
* [mercyblitz/thinking-in-spring-boot-samples](https://github.com/mercyblitz/thinking-in-spring-boot-samples) - ??????????????????Spring Boot ???????????????????????????
* [apache/iotdb](https://github.com/apache/iotdb) - Apache IoTDB
* [heinrichreimer/material-intro](https://github.com/heinrichreimer/material-intro) - A simple material design app intro with cool animations and a fluent API.
* [vaadin/framework](https://github.com/vaadin/framework) - Vaadin 6, 7, 8   is a Java framework for modern Java web applications.
* [liuguangqiang/SwipeBack](https://github.com/liuguangqiang/SwipeBack) - SwipeBack is an android library that can finish a activity by using gesture.
* [CarpenterLee/JavaLambdaInternals](https://github.com/CarpenterLee/JavaLambdaInternals) - ????????????Java??????????????????Streams API
* [marytts/marytts](https://github.com/marytts/marytts) - MARY TTS -- an open-source, multilingual text-to-speech synthesis system written in pure java
* [plutext/docx4j](https://github.com/plutext/docx4j) - JAXB-based Java library for Word docx, Powerpoint pptx, and Excel xlsx files
* [cbeust/testng](https://github.com/cbeust/testng) - TestNG testing framework
* [doublechaintech/scm-biz-suite](https://github.com/doublechaintech/scm-biz-suite) - ???????????????????????????????????????????????????, ????????????, ???????????????,  ????????????, ????????????, ????????????, ????????????, ????????????, ????????????, ????????????, ???????????????, ????????????, ??????React/Ant Design, ??????Java Spring+?????????????????????????????????MySQL, PostgreSQL, ???????????????????????????????????????GBase 8s,??????REST???????????????????????????????????????
* [roncoo/spring-boot-demo](https://github.com/roncoo/spring-boot-demo) - Spring Boot???????????????????????????????????????????????????Spring Boot???????????????????????????????????????Spring Cloud?????????????????????https://github.com/roncoo/spring-cloud-demo
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
* [acmenlt/dynamic-threadpool](https://github.com/acmenlt/dynamic-threadpool) - ???? ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????Powerful dynamic thread pool, does not rely on any middleware, with monitoring and alarm function.
* [flyingsaucerproject/flyingsaucer](https://github.com/flyingsaucerproject/flyingsaucer) - XML/XHTML and CSS 2.1 renderer in pure Java
* [RichardWarburton/java-8-lambdas-exercises](https://github.com/RichardWarburton/java-8-lambdas-exercises) - Exercises and Answers for Java 8 Lambdas book
* [klinker24/talon-twitter-holo](https://github.com/klinker24/talon-twitter-holo) - [Deprecated] The Holo version of my popular Android Talon for Twitter app, 100% open-source
* [prometheus/client_java](https://github.com/prometheus/client_java) - Prometheus instrumentation library for JVM applications
* [FreeTymeKiyan/LeetCode-Sol-Res](https://github.com/FreeTymeKiyan/LeetCode-Sol-Res) - Clean, Understandable Solutions and Resources for LeetCode Online Judge Algorithm Problems.
* [flutter/flutter-intellij](https://github.com/flutter/flutter-intellij) - Flutter Plugin for IntelliJ
* [KikiLetGo/VirusBroadcast](https://github.com/KikiLetGo/VirusBroadcast) - A java virus broadcast simulation
* [xuxueli/xxl-sso](https://github.com/xuxueli/xxl-sso) - A distributed single-sign-on framework.??????????????????????????????XXL-SSO???
* [ZHENFENG13/ssm-demo](https://github.com/ZHENFENG13/ssm-demo) - :banana:Spring+SpringMVC+Mybatis+easyUI?????????????????????????????????
* [ysc/word](https://github.com/ysc/word) - Java??????????????????????????? - word??????
* [eclipse/paho.mqtt.java](https://github.com/eclipse/paho.mqtt.java) - Eclipse Paho Java MQTT client library.  Paho is an Eclipse IoT project.
* [spotify/apollo](https://github.com/spotify/apollo) - Java libraries for writing composable microservices
* [kairosdb/kairosdb](https://github.com/kairosdb/kairosdb) - Fast scalable time series database
* [jberkel/sms-backup-plus](https://github.com/jberkel/sms-backup-plus) - Backup Android SMS, MMS and call log to Gmail / Gcal / IMAP
* [tlaplus/tlaplus](https://github.com/tlaplus/tlaplus) - TLC is an explicit state model checker for specifications written in TLA+. The TLA+Toolbox is an IDE for TLA+.
* [threedr3am/learnjavabug](https://github.com/threedr3am/learnjavabug) - Java??????????????????????????????demo?????????Java???Fastjson???Jackson???Hessian2???XML???????????????????????????Spring???Dubbo???Shiro???CAS???Tomcat???RMI???Nexus?????????\?????????\?????????exploits??????Java Security Manager?????????Dubbo-Hessian2?????????????????????????????????
* [apache/drill](https://github.com/apache/drill) - Apache Drill is a distributed MPP query layer for self describing data
* [pf4j/pf4j](https://github.com/pf4j/pf4j) - Plugin Framework for Java (PF4J)
* [JeffLi1993/java-core-learning-example](https://github.com/JeffLi1993/java-core-learning-example) - ??????Java???????????????????????????????????????????????????????????????????????????????????????
* [pedroSG94/rtmp-rtsp-stream-client-java](https://github.com/pedroSG94/rtmp-rtsp-stream-client-java) - Library to stream in rtmp and rtsp for Android. All code in Java
* [opentracing/opentracing-java](https://github.com/opentracing/opentracing-java) - OpenTracing API for Java
* [bravoborja/ReadMoreTextView](https://github.com/bravoborja/ReadMoreTextView) - A Custom TextView with trim text
* [googleapis/google-cloud-java](https://github.com/googleapis/google-cloud-java) - Google Cloud Client Library for Java
* [openhab/openhab-addons](https://github.com/openhab/openhab-addons) - Add-ons for openHAB
* [UweTrottmann/SeriesGuide](https://github.com/UweTrottmann/SeriesGuide) - Track your favorite TV shows and movies on Android devices.
* [GoogleLLP/SuperMarket](https://github.com/GoogleLLP/SuperMarket) - ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????SpringCloud???????????????Java??????????????????????????????????????????????????????????????????
* [indy256/codelibrary](https://github.com/indy256/codelibrary) - :gem:Collection of algorithms and data structures
* [coderbruis/JavaSourceCodeLearning](https://github.com/coderbruis/JavaSourceCodeLearning) - Java???????????????????????????Spring?????????SpringBoot?????????SpringAOP?????????SpringSecurity?????????SpringSecurity OAuth2?????????JDK?????????Netty??????
* [bcgit/bc-java](https://github.com/bcgit/bc-java) - Bouncy Castle Java Distribution (Mirror)
* [casbin/jcasbin](https://github.com/casbin/jcasbin) - An authorization library that supports access control models like ACL, RBAC, ABAC in Java
* [jdbi/jdbi](https://github.com/jdbi/jdbi) - jdbi is designed to provide convenient tabular data access in Java; including templated SQL, parameterized and strongly typed queries, and Streams integration
* [aNNiMON/Lightweight-Stream-API](https://github.com/aNNiMON/Lightweight-Stream-API) - Stream API from Java 8 rewritten on iterators for Java 7 and below
* [Yalantis/ToDoList](https://github.com/Yalantis/ToDoList) - Micro-Transitions for Smooth Android To-Do List Animations
* [javahongxi/whatsmars](https://github.com/javahongxi/whatsmars) - Java????????????(Spring Boot + Redis + Dubbo + RocketMQ + Elasticsearch)????????????????????
* [p6spy/p6spy](https://github.com/p6spy/p6spy) - P6Spy is a framework that enables database data to be seamlessly intercepted and logged with no code changes to the application.
* [apache/ambari](https://github.com/apache/ambari) - Mirror of Apache Ambari
* [rapidoid/rapidoid](https://github.com/rapidoid/rapidoid) - Rapidoid - Extremely Fast, Simple and Powerful Java Web Framework and HTTP Server!
* [vran-dev/PrettyZoo](https://github.com/vran-dev/PrettyZoo) - ????    Pretty nice Zookeeper GUI, Support Win / Mac / Linux Platform
* [majidgolshadi/Android-Download-Manager-Pro](https://github.com/majidgolshadi/Android-Download-Manager-Pro) - Android/Java download manager library help you to download files in parallel mechanism in some chunks.
* [shekhargulati/java8-the-missing-tutorial](https://github.com/shekhargulati/java8-the-missing-tutorial) - Java 8 for all of us
* [jayZheng87/Thusy](https://github.com/jayZheng87/Thusy) - Java ?????????????????????????????? Hutool ?????????????????????????????????????????????
* [apache/pdfbox](https://github.com/apache/pdfbox) - Mirror of Apache PDFBox
* [j256/ormlite-android](https://github.com/j256/ormlite-android) - ORMLite Android functionality used in conjunction with ormlite-core
* [Smith-Cruise/Spring-Boot-Shiro](https://github.com/Smith-Cruise/Spring-Boot-Shiro) - Shiro??????SpringBoot +JWT???????????????restful??????
* [uber-common/jvm-profiler](https://github.com/uber-common/jvm-profiler) - JVM Profiler Sending Metrics to Kafka, Console Output or Custom Reporter
* [JorenSix/TarsosDSP](https://github.com/JorenSix/TarsosDSP) - A Real-Time Audio Processing Framework in Java
* [xianrendzw/EasyReport](https://github.com/xianrendzw/EasyReport) - A simple and easy to use Web Report System for java.EasyReport????????????????????????Web????????????(??????Hadoop,HBase???????????????????????????),????????????????????????SQL???????????????????????????????????????HTML??????(Table)???????????????????????????(RowSpan)?????????(ColSpan)???????????????????????????Excel????????????????????????????????????????????????????????????
* [nayuki/Project-Euler-solutions](https://github.com/nayuki/Project-Euler-solutions) - Runnable code for solving Project Euler problems in Java, Python, Mathematica, Haskell.
* [Netflix/genie](https://github.com/Netflix/genie) - Distributed Big Data Orchestration Service
* [asLody/legend](https://github.com/asLody/legend) - A framework for hook java methods.
* [fabric8io/docker-maven-plugin](https://github.com/fabric8io/docker-maven-plugin) - Maven plugin for running and creating Docker images
* [GlowstoneMC/Glowstone](https://github.com/GlowstoneMC/Glowstone) - A fast, customizable and compatible open source server for Minecraft: Java Edition
* [spring-cloud/spring-cloud-sleuth](https://github.com/spring-cloud/spring-cloud-sleuth) - Distributed tracing for spring cloud
* [asciidocfx/AsciidocFX](https://github.com/asciidocfx/AsciidocFX) - Asciidoc Editor and Toolchain written with JavaFX 16 (Build PDF, Epub, Mobi and HTML books, documents and slides)
* [springdoc/springdoc-openapi](https://github.com/springdoc/springdoc-openapi) - Library for OpenAPI 3 with spring-boot
* [MorphiaOrg/morphia](https://github.com/MorphiaOrg/morphia) - MongoDB object-document mapper in Java based on https://github.com/mongodb/mongo-java-driver
* [cachecats/coderiver](https://github.com/cachecats/coderiver) -  ?????????????????????????????????????????????????????????????????????  pc ??????Vue???React???????????? H5???Vue???React??????ReactNative???Flutter???Android ???????????????????????????Angular???Node???java ???????????????????????????????????????????????????
* [UniversalMediaServer/UniversalMediaServer](https://github.com/UniversalMediaServer/UniversalMediaServer) - A DLNA, UPnP and HTTP(S) Media Server.
* [SundeepK/CompactCalendarView](https://github.com/SundeepK/CompactCalendarView) - An android library which provides a compact calendar view much like the one used in google calenders.
* [googlemaps/google-maps-services-java](https://github.com/googlemaps/google-maps-services-java) - Java client library for Google Maps API Web Services
* [youseries/ureport](https://github.com/youseries/ureport) - UReport2 is a high-performance pure Java report engine based on Spring architecture, where complex Chinese-style statements and reports can be prepared by iterating over cells.
* [jdeferred/jdeferred](https://github.com/jdeferred/jdeferred) - Java Deferred/Promise library similar to JQuery.
* [dcevm/dcevm](https://github.com/dcevm/dcevm) - Dynamic Code Evolution VM for Java 7/8
* [Joolun/JooLun-wx](https://github.com/Joolun/JooLun-wx) - JooLun???????????????Java + SpringBoot + Maven + Swagger + Mybatis Plus + Redis + Vue + elementUI???????????????????????????????????????????????????????????????????????????????????????????????????????????????Sass???Uniapp????????????????????????????????????SKU???????????????????????????????????? ???????????????????????????????????????????????????????????????????????????????????????
* [functionaljava/functionaljava](https://github.com/functionaljava/functionaljava) - Functional programming in Java
* [mendhak/gpslogger](https://github.com/mendhak/gpslogger) - :satellite: Lightweight GPS Logging Application For Android.
* [binarywang/weixin-java-mp-demo](https://github.com/binarywang/weixin-java-mp-demo) - ??????Spring Boot ??? WxJava ????????????????????????Java??????Demo?????????????????????
* [wangjiegulu/WheelView](https://github.com/wangjiegulu/WheelView) - Android??????????????????
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
* [fengjiachun/Jupiter](https://github.com/fengjiachun/Jupiter) - Jupiter??????????????????????????????, ?????????????????????????????????
* [mercyblitz/segmentfault-lessons](https://github.com/mercyblitz/segmentfault-lessons) - Segment Fault ???????????? ????????????
* [waylau/netty-4-user-guide-demos](https://github.com/waylau/netty-4-user-guide-demos) - Netty demos. ???Netty ???????????????
* [RuedigerMoeller/fast-serialization](https://github.com/RuedigerMoeller/fast-serialization) - FST: fast java serialization drop in-replacement
* [yahoo/mysql_perf_analyzer](https://github.com/yahoo/mysql_perf_analyzer) - MySQL performance monitoring and analysis.
* [jooby-project/jooby](https://github.com/jooby-project/jooby) - The modular web framework for Java and Kotlin
* [spotify/docker-client](https://github.com/spotify/docker-client) - INACTIVE: A simple docker client for the JVM
* [netgloo/spring-boot-samples](https://github.com/netgloo/spring-boot-samples) - Spring Boot samples by Netgloo
* [iqiyi/Qigsaw](https://github.com/iqiyi/Qigsaw) - ????????Qigsaw ['t??????s??] is a dynamic modularization library which is based on Android App Bundles(Do not need Google Play Service). It supports dynamic delivery for split APKs without reinstalling the base one.
* [galenframework/galen](https://github.com/galenframework/galen) - Layout and functional testing framework for websites
* [sleuthkit/autopsy](https://github.com/sleuthkit/autopsy) - Autopsy?? is a digital forensics platform and graphical interface to The Sleuth Kit?? and other digital forensics tools. It can be used by law enforcement, military, and corporate examiners to investigate what happened on a computer. You can even use it to recover photos from your camera's memory card.
* [erupts/erupt](https://github.com/erupts/erupt) - ???? ??? Java ??????????????????????????????????????? Admin ???????????????????????????????????????????????????????????? CURD???????????????????????????API????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????Spring Boot???JPA???Reflect???TypeScript???NG-ZORRO?????? ????????????????????????????????????star????????????~
* [JonathanLink/PDFLayoutTextStripper](https://github.com/JonathanLink/PDFLayoutTextStripper) - Converts a pdf file into a text file while keeping the layout of the original pdf. Useful to extract the content from a table in a pdf file for instance. This is a subclass of PDFTextStripper class (from the Apache PDFBox library).
* [hapifhir/hapi-fhir](https://github.com/hapifhir/hapi-fhir) - ???? HAPI FHIR - Java API for HL7 FHIR Clients and Servers
* [youseries/urule](https://github.com/youseries/urule) - URULE???????????????RETE????????????Java?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [yzcheng90/X-SpringBoot](https://github.com/yzcheng90/X-SpringBoot) - X-SpringBoot?????????????????????Java????????????????????????????????????????????????????????????????????????
* [spring-projects/spring-data-redis](https://github.com/spring-projects/spring-data-redis) - Provides support to increase developer productivity in Java when using Redis, a key-value store. Uses familiar Spring concepts such as a template classes for core API usage and lightweight repository style data access.
* [tobato/FastDFS_Client](https://github.com/tobato/FastDFS_Client) - Java Client for FastDFS
* [square/haha](https://github.com/square/haha) - DEPRECATED Java library to automate the analysis of Android heap dumps.
* [centic9/jgit-cookbook](https://github.com/centic9/jgit-cookbook) - Provides examples and code snippets for the JGit Java Git implementation
* [GoogleCloudPlatform/java-docs-samples](https://github.com/GoogleCloudPlatform/java-docs-samples) - Java and Kotlin Code samples used on cloud.google.com
* [JoyChou93/java-sec-code](https://github.com/JoyChou93/java-sec-code) - Java web common vulnerabilities and security code which is base on springboot and spring security
* [aimacode/aima-java](https://github.com/aimacode/aima-java) - Java implementation of algorithms from Russell And Norvig's "Artificial Intelligence - A Modern Approach"
* [OpenHFT/Java-Thread-Affinity](https://github.com/OpenHFT/Java-Thread-Affinity) - Bind a java thread to a given core
* [tomoya92/pybbs](https://github.com/tomoya92/pybbs) - ????????????Java???????????????(??????)???Better use of Java development community (forum)
* [haraldk/TwelveMonkeys](https://github.com/haraldk/TwelveMonkeys) - TwelveMonkeys ImageIO: Additional plug-ins and extensions for Java's ImageIO
* [lilishop/lilishop](https://github.com/lilishop/lilishop) - ???????????? ???????????? java?????????????????? ???????????????
* [Docile-Alligator/Infinity-For-Reddit](https://github.com/Docile-Alligator/Infinity-For-Reddit) - A Reddit client for Android
* [json-iterator/java](https://github.com/json-iterator/java) - jsoniter (json-iterator) is fast and flexible JSON parser available in Java and Go
* [i2p/i2p.i2p](https://github.com/i2p/i2p.i2p) - I2P is an anonymizing network, offering a simple layer that identity-sensitive applications can use to securely communicate. All data is wrapped with several layers of encryption, and the network is both distributed and dynamic, with no trusted parties.
* [Haleydu/Cimoc](https://github.com/Haleydu/Cimoc) - ???????????????
* [shekhargulati/strman-java](https://github.com/shekhargulati/strman-java) - A Java 8 string manipulation library.
* [88250/symphony](https://github.com/88250/symphony) - ???? ????????? Java ?????????????????????????????????/??????/BBS/????????????/????????????????????????A modern community (forum/Q&A/BBS/SNS/blog) system platform implemented in Java. https://ld246.com
* [winder/Universal-G-Code-Sender](https://github.com/winder/Universal-G-Code-Sender) - A cross-platform G-Code sender for GRBL, Smoothieware, TinyG and G2core.
* [bootique/bootique](https://github.com/bootique/bootique) - Bootique is a minimally opinionated platform for modern runnable Java apps.
* [0Chencc/CTFCrackTools](https://github.com/0Chencc/CTFCrackTools) - China's first CTFTools framework.??????????????????CTF????????????,????????????CTFer??????????????????
* [dain/leveldb](https://github.com/dain/leveldb) - Port of LevelDB to Java
* [spring-projects/spring-data-mongodb](https://github.com/spring-projects/spring-data-mongodb) - Provide support to increase developer productivity in Java when using MongoDB. Uses familiar Spring concepts such as a template classes for core API usage and lightweight repository style data access.
* [CoderLeixiaoshuai/java-eight-part](https://github.com/CoderLeixiaoshuai/java-eight-part) - ???Java????????????Java???????????????Java????????????????????????????????????Offer??????????????????
* [greenrobot/essentials](https://github.com/greenrobot/essentials) - General purpose utilities and hash functions for Android and Java (aka java-common)
* [albertlatacz/java-repl](https://github.com/albertlatacz/java-repl) - Read Eval Print Loop for Java
* [NLPchina/nlp-lang](https://github.com/NLPchina/nlp-lang) - ??????????????????????????????.??????????????????nlp?????????????????????
* [komoot/photon](https://github.com/komoot/photon) - an open source geocoder for openstreetmap data
* [kenglxn/QRGen](https://github.com/kenglxn/QRGen) - a simple QRCode generation api for java built on top ZXING
* [google/flogger](https://github.com/google/flogger) - A Fluent Logging API for Java
* [hcoles/pitest](https://github.com/hcoles/pitest) - State of the art mutation testing system for the JVM
* [graphhopper/jsprit](https://github.com/graphhopper/jsprit) - jsprit is a java based, open source toolkit for solving rich vehicle routing problems
* [mitreid-connect/OpenID-Connect-Java-Spring-Server](https://github.com/mitreid-connect/OpenID-Connect-Java-Spring-Server) - An OpenID Connect reference implementation in Java on the Spring platform.
* [vladimir-bukhtoyarov/bucket4j](https://github.com/vladimir-bukhtoyarov/bucket4j) - Java rate limiting library based on token/leaky-bucket algorithm.
* [vigna/fastutil](https://github.com/vigna/fastutil) - fastutil extends the Java??? Collections Framework by providing type-specific maps, sets, lists and queues.
* [JackJiang2011/beautyeye](https://github.com/JackJiang2011/beautyeye) - BeautyEye is a Java Swing cross-platform look and feel.
* [OysterQAQ/Pixiv-Illustration-Collection-Backend](https://github.com/OysterQAQ/Pixiv-Illustration-Collection-Backend) - pixivic Backend
* [danfickle/openhtmltopdf](https://github.com/danfickle/openhtmltopdf) - An HTML to PDF library for the JVM. Based on Flying Saucer and Apache PDF-BOX 2. With SVG image support. Now also with accessible PDF support (WCAG, Section 508, PDF/UA)!
* [apache/poi](https://github.com/apache/poi) - Mirror of Apache POI
* [gravitee-io/gravitee-api-management](https://github.com/gravitee-io/gravitee-api-management) - Gravitee.io - OpenSource API Management
* [Discord4J/Discord4J](https://github.com/Discord4J/Discord4J) - Discord4J is a fast, powerful, unopinionated, reactive library to enable quick and easy development of Discord bots for Java, Kotlin, and other JVM languages using the official Discord Bot API.
* [aws/aws-sdk-java-v2](https://github.com/aws/aws-sdk-java-v2) - The official AWS SDK for Java - Version 2
* [itext/itextpdf](https://github.com/itext/itextpdf) - [DEPRECATED] Core Java Library + PDF/A, xtra and XML Worker. Only security fixes will be added ??? please use iText??7
* [tabulapdf/tabula-java](https://github.com/tabulapdf/tabula-java) - Extract tables from PDF files
* [jwpttcg66/NettyGameServer](https://github.com/jwpttcg66/NettyGameServer) - ??????netty4.X???????????????????????????????????????,??????tcp,udp,http,websocket???????????????protobuf????????????????????????????????????,??????rpc????????????,??????mybatis3??????db?????????????????????????????????mysql?????????db?????????????????????reids????????? ??????ExcelToCode????????????excel????????????java??????json???????????????DictService????????????json??????????????????????????????????????????game-executor???????????????????????????????????????????????????, ????????????sharding,?????????????????????????????????
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
* [864381832/xJavaFxTool](https://github.com/864381832/xJavaFxTool) - ??????JavaFx??????????????????????????????????????????????????????????????????????????????????????????javaFx?????????????????????????????????????????????????????????Cron???????????????????????????????????????????????????Time???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????Mq???????????????Http???????????????json?????????????????????????????????????????????Redis????????????????????????????????????????????????Hosts?????????Ftp????????????Cmd???????????????Ftp/Ftps/Sftp????????????????????????Pdf?????????????????????????????????????????????????????????????????????????????????Kafka???????????????Email??????????????????????????????????????????????????????????????????????????????????????????????????????Json????????????????????????Socket???????????????????????????????????????????????????Zookeeper?????????Excel????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????mp3??????????????????????????????
* [iTXTech/Daedalus](https://github.com/iTXTech/Daedalus) - No root required Android DNS modifier and Hosts/DNSMasq resolver.
* [BuildCraft/BuildCraft](https://github.com/BuildCraft/BuildCraft) - BuildCraft
* [EssentialsX/Essentials](https://github.com/EssentialsX/Essentials) - The essential plugin suite for Minecraft servers.
* [spring-projects/spring-data-book](https://github.com/spring-projects/spring-data-book) - Spring Data - The Definitive Guide - Modern Data Access for Enterprise Java Developers
* [cincheo/jsweet](https://github.com/cincheo/jsweet) - A Java to JavaScript transpiler.
* [LeonardoZ/java-concurrency-patterns](https://github.com/LeonardoZ/java-concurrency-patterns) - Concurrency Patterns and features found in Java, through multithreaded programming. Threads, Locks, Atomics and more.
* [msgpack/msgpack-java](https://github.com/msgpack/msgpack-java) - MessagePack serializer implementation for Java / msgpack.org[Java]
* [hellokaton/learn-java8](https://github.com/hellokaton/learn-java8) - ????????????? Java 8?????????????????????
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
* [qiurunze123/threadandjuc](https://github.com/qiurunze123/threadandjuc) - ?????????????????????-?????????-?????????three-high-import????????????-????????????????????????
* [gaopu/Java](https://github.com/gaopu/Java) - ?????????Java?????????????????????????????????????????????star??????????
* [ocpsoft/prettytime](https://github.com/ocpsoft/prettytime) - Social Style Date and Time Formatting for Java
* [tang-jie/NettyRPC](https://github.com/tang-jie/NettyRPC) - NettyRPC is high performance java rpc server base on Netty,using kryo,hessian,protostuff support message serialization.
* [manifold-systems/manifold](https://github.com/manifold-systems/manifold) - Manifold is a Java compiler plugin, its features include Metaprogramming, Properties, Extension Methods, Operator Overloading, Templates, a Preprocessor, and more.
* [wupeixuan/JDKSourceCode1.8](https://github.com/wupeixuan/JDKSourceCode1.8) - Jdk1.8????????????
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
* [sofastack/sofa-ark](https://github.com/sofastack/sofa-ark) - SOFAArk is a light-weight???java based classloader isolation framework.
* [apache/cloudstack](https://github.com/apache/cloudstack) - Apache Cloudstack
* [square/javapoet](https://github.com/square/javapoet) - A Java API for generating .java source files.
* [grpc/grpc-java](https://github.com/grpc/grpc-java) - The Java gRPC implementation. HTTP/2 based RPC
* [pxb1988/dex2jar](https://github.com/pxb1988/dex2jar) - Tools to work with android .dex and java .class files
* [perwendel/spark](https://github.com/perwendel/spark) - A simple expressive web framework for java. Spark has a kotlin DSL https://github.com/perwendel/spark-kotlin
* [jhy/jsoup](https://github.com/jhy/jsoup) - jsoup: the Java HTML parser, built for HTML editing, cleaning, scraping, and XSS safety.
* [apereo/cas](https://github.com/apereo/cas) - Apereo CAS - Enterprise Single Sign On for all earthlings and beyond.
* [DuGuQiuBai/Java](https://github.com/DuGuQiuBai/Java) - 27?????????Java??????
* [doocs/leetcode](https://github.com/doocs/leetcode) - ???? LeetCode solutions in any programming language | ???????????????????????? LeetCode???????????? Offer?????? 2 ?????????????????????????????????????????? 6 ???????????????
* [TooTallNate/Java-WebSocket](https://github.com/TooTallNate/Java-WebSocket) - A barebones WebSocket client and server implementation written in 100% Java.
* [InterestingLab/seatunnel](https://github.com/InterestingLab/seatunnel) - Production Ready Data Integration Product, documentation???
* [jhipster/jhipster-sample-app](https://github.com/jhipster/jhipster-sample-app) - This is a sample application created with JHipster
* [mitre/HTTP-Proxy-Servlet](https://github.com/mitre/HTTP-Proxy-Servlet) - Smiley's HTTP Proxy implemented as a Java servlet
* [codinguser/gnucash-android](https://github.com/codinguser/gnucash-android) - Gnucash for Android mobile companion application.
* [SpongePowered/SpongeForge](https://github.com/SpongePowered/SpongeForge) - A Forge mod that implements SpongeAPI
* [HanSolo/tilesfx](https://github.com/HanSolo/tilesfx) - A JavaFX library containing tiles that can be used for dashboards.
* [florent37/FiftyShadesOf](https://github.com/florent37/FiftyShadesOf) - An elegant context-care loading placeholder for Android
* [ajanata/PretendYoureXyzzy](https://github.com/ajanata/PretendYoureXyzzy) - A web clone of the card game Cards Against Humanity.
* [QuadFlask/colorpicker](https://github.com/QuadFlask/colorpicker) - ????color picker for android
* [itext/itext7](https://github.com/itext/itext7) - iText 7 for Java represents the next level of SDKs for developers that want to take advantage of the benefits PDF can bring. Equipped with a better document engine, high and low-level programming capabilities and the ability to create, edit and enhance PDF documents, iText 7 can be a boon to nearly every workflow.
* [MyCollab/mycollab](https://github.com/MyCollab/mycollab) - An open source, free, high performance, stable and secure Java Application Business Platform of Project Management and Document
* [Java-aid/Hackerrank-Solutions](https://github.com/Java-aid/Hackerrank-Solutions) - hackerrank solutions github | hackerrank all solutions | hackerrank solutions for java | hackerrank video tutorial | hackerrank cracking the coding interview solutions | hackerrank data structures  | hackerrank solutions algorithms  | hackerrank challenge | hackerrank coding challenge | hackerrank algorithms solutions github| hackerrank problem solving | hackerrank programs solutions | JAVAAID |all hackerrank solutions | Coding Interview Preparation
* [berndruecker/flowing-retail](https://github.com/berndruecker/flowing-retail) - Sample application demonstrating an order fulfillment system decomposed into multiple independant components (e.g. microservices). Showing concrete implementation alternatives using e.g. Java, Spring Boot, Apache Kafka, Camunda, Zeebe, ...
* [apache/struts](https://github.com/apache/struts) - Mirror of Apache Struts
* [patric-r/jvmtop](https://github.com/patric-r/jvmtop) - Java monitoring for the command-line, profiler included
* [THEONE10211024/RxJavaSamples](https://github.com/THEONE10211024/RxJavaSamples) - ?????????RxJava??????????????????????????????????????????????????????...
* [tmobile/pacbot](https://github.com/tmobile/pacbot) - PacBot (Policy as Code Bot)
* [kangjianwei/LearningJDK](https://github.com/kangjianwei/LearningJDK) - JDK??????????????????
* [DreamCats/java-notes](https://github.com/DreamCats/java-notes) - ??????????????????????????????????????????????????????????????????????????????????????????????Java?????????????????????????????????????????????????????????????????????????????????????????????(????????????)
* [stephanenicolas/toothpick](https://github.com/stephanenicolas/toothpick) - A scope tree based Dependency Injection (DI) library for Java / Kotlin / Android.
* [rkalla/imgscalr](https://github.com/rkalla/imgscalr) - Simple Java image-scaling library implementing Chris Campbell's incremental scaling algorithm as well as Java2D's "best-practices" image-scaling techniques.
* [zalando/intellij-swagger](https://github.com/zalando/intellij-swagger) - A plugin to help you easily edit Swagger and OpenAPI specification files inside IntelliJ IDEA
* [linkedin/parseq](https://github.com/linkedin/parseq) - Asynchronous Java made easier
* [leibnitz27/cfr](https://github.com/leibnitz27/cfr) - This is the public repository for the CFR Java decompiler
* [googleapis/google-api-java-client](https://github.com/googleapis/google-api-java-client) - Google APIs Client Library for Java
* [klinker24/talon-for-twitter-android](https://github.com/klinker24/talon-for-twitter-android) - The most powerful and beautiful Twitter client available.
* [devnied/EMV-NFC-Paycard-Enrollment](https://github.com/devnied/EMV-NFC-Paycard-Enrollment) - A Java library used to read and extract data from NFC EMV credit cards (Android/PCSC).
* [Azure/azure-sdk-for-java](https://github.com/Azure/azure-sdk-for-java) - This repository is for active development of the Azure SDK for Java. For consumers of the SDK we recommend visiting our public developer docs at https://docs.microsoft.com/java/azure/ or our versioned developer docs at https://azure.github.io/azure-sdk-for-java.
* [chenssy89/jutils](https://github.com/chenssy89/jutils) - jutils????????????Java??????????????????????????????????????????????????????????????????????????????????????????????????????excel???????????????word???????????????????????????????????????????????????????????????????????????
* [microsoft/gctoolkit](https://github.com/microsoft/gctoolkit) - Tool for parsing GC logs
* [SpongePowered/SpongeAPI](https://github.com/SpongePowered/SpongeAPI) - A Minecraft plugin API
* [nguyenq/tess4j](https://github.com/nguyenq/tess4j) - Java JNA wrapper for Tesseract OCR API
* [zaiyunduan123/Java-Summarize](https://github.com/zaiyunduan123/Java-Summarize) - :books:Java??????????????????????????????Java?????????JVM??????????????????????????????????????????????????????????????????????????????????????????????????????
* [JaceyRx/Examination_System](https://github.com/JaceyRx/Examination_System) - ????????????????????????????????????????????????SpringMVC + Spring + Mybatis + Shiro + Bootstrap???
* [stealthcopter/AndroidNetworkTools](https://github.com/stealthcopter/AndroidNetworkTools) - Set of useful android network tools
* [magese/ik-analyzer-solr](https://github.com/magese/ik-analyzer-solr) - ik-analyzer for solr 7.x-8.x
* [apache/opennlp](https://github.com/apache/opennlp) - Mirror of Apache OpenNLP
* [datumbox/datumbox-framework](https://github.com/datumbox/datumbox-framework) - Datumbox is an open-source Machine Learning framework written in Java which allows the rapid development of Machine Learning and Statistical applications.
* [lets-mica/mica](https://github.com/lets-mica/mica) - Spring Cloud ?????????????????????????????????????????????????????????http???redis???ip2region???xss ????????????????????? ???? ???? ?????????????????????star ???????????????
* [Grover-c13/PokeGOAPI-Java](https://github.com/Grover-c13/PokeGOAPI-Java) - Pokemon Go API
* [bramp/ffmpeg-cli-wrapper](https://github.com/bramp/ffmpeg-cli-wrapper) - Java wrapper around the FFmpeg command line tool
* [xujeff/tianti](https://github.com/xujeff/tianti) - java????????????CMS????????????-???????????????????????????java???????????????????????????CMS???????????????????????????????????????????????????????????????????????????????????????dao???service??????????????????????????????????????????Spring Data JPA???Hibernate???Shiro??? Spring MVC???Layer???Mysql??????
* [openmrs/openmrs-core](https://github.com/openmrs/openmrs-core) - OpenMRS API and web application code
* [diwi/PixelFlow](https://github.com/diwi/PixelFlow) - A Processing/Java library for high performance GPU-Computing (GLSL). Fluid Simulation + SoftBody Dynamics + Optical Flow + Rendering + Image Processing + Particle Systems + Physics +...
* [pengwei1024/LogUtils](https://github.com/pengwei1024/LogUtils) - More convenient and easy to use android Log manager
* [jiang111/RxJavaApp](https://github.com/jiang111/RxJavaApp) - ??????RxJava????????????APP,??????RxJava2.x??????
* [MSPaintIDE/MSPaintIDE](https://github.com/MSPaintIDE/MSPaintIDE) - Programming in MS Paint
* [yahoo/egads](https://github.com/yahoo/egads) - A Java package to automatically detect anomalies in large scale time-series data
* [alibaba/taokeeper](https://github.com/alibaba/taokeeper) - ZooKeeper-Monitor, a monitor for zookeeper in java. Download https://github.com/alibaba/taokeeper/downloads
* [bin392328206/six-finger](https://github.com/bin392328206/six-finger) - ???????Java?????????JavaWeb??????????????????????????????????????????????????????????????????????????????????????????????????????????????????Java??????????????????
* [influxdata/influxdb-java](https://github.com/influxdata/influxdb-java) - Java client for InfluxDB
* [zalando/logbook](https://github.com/zalando/logbook) - An extensible Java library for HTTP request and response logging
* [rabbitmq/rabbitmq-java-client](https://github.com/rabbitmq/rabbitmq-java-client) - RabbitMQ Java client
* [eclipse/eclipse.jdt.ls](https://github.com/eclipse/eclipse.jdt.ls) - Java language server
* [abel533/ECharts](https://github.com/abel533/ECharts) - ??????????????????ECharts2.x?????????Java????????????????????????ECharts??????Json???????????????Java???????????????????????????????????????Option,Series???
* [SilenceIM/Silence](https://github.com/SilenceIM/Silence) - PROJECT MOVED: https://git.silence.dev/Silence/Silence-Android/ (GitHub is just a mirror.)
* [UCodeUStory/DataStructure](https://github.com/UCodeUStory/DataStructure) - ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????Java???????????????Android????????????
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
* [DragonetMC/DragonProxy](https://github.com/DragonetMC/DragonProxy) - ???? A proxy to allow Minecraft: Bedrock clients to connect to Minecraft: Java Edition servers.
* [mgarin/weblaf](https://github.com/mgarin/weblaf) - WebLaF is a fully open-source Look & Feel and component library written in pure Java for cross-platform desktop Swing applications.
* [wfh45678/radar](https://github.com/wfh45678/radar) - ??????????????????(Risk Engine)???????????????????????????Rule Script?????????????????????????????????????????????(Anti-fraud)???????????????????????????????????????????????????????????????????????????????????? Get ????????????
* [18601949127/DiDiCallCar](https://github.com/18601949127/DiDiCallCar) - ????????????????????????????????????????????????Android???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????  1. RFID??????????????????????????????????????????????????????????????????RFID??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????JNI????????????C?????????MD5????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????RFID???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????? 2. ????????????????????????????????????????????? 3. ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????I complete this whole project on my own . Including Android application programming???web server ( Apache + PHP + MySQL),  and UI.  1???Map route planing???You can use mobile phone choose pick up & destination address???application provide address name hint and draw optimized route for user , then call car for you. 2???RFID authentication function???User can use application to scan driver license or other RFID hardware, then use NDK MD5 algorithm encrypt RFID number, and send it to Web Server Database, check with driver information and authenticate ID number , if ID number coherent with driver info , send back driver information to User and continue call car order . record user location  and alert if ID not coherent. 3???Driver License Number Recognition : Application can recognize driver license digit number ,and also can send to web server for authentication & feed back result to user.
* [Minestom/Minestom](https://github.com/Minestom/Minestom) - 1.17.1 Lightweight and multi-threaded Minecraft server
* [bufferapp/BufferTextInputLayout](https://github.com/bufferapp/BufferTextInputLayout) - A simple customised version of the TextInputLayout from the Android Design Support Library ??????
* [AOF-Dev/MCinaBox](https://github.com/AOF-Dev/MCinaBox) - MCinaBox - A Minecraft: Java Edition Launcher for Android.  An Encapsulation of [CosineMath's BoatApp](https://github.com/AOF-Dev/BoatApp).
* [spotify/mobius](https://github.com/spotify/mobius) - A functional reactive framework for managing state evolution and side-effects.
* [oracle/tribuo](https://github.com/oracle/tribuo) - Tribuo - A Java machine learning library
* [DWorkS/VolleyPlus](https://github.com/DWorkS/VolleyPlus) - ???? Volley library : make everything faster . Its an improvements for Volley by Google for Android  https://android.googlesource.com/platform/frameworks/volley
* [alibaba/Alink](https://github.com/alibaba/Alink) - Alink is the Machine Learning algorithm platform based on Flink, developed by the PAI team of Alibaba computing platform.
* [dboissier/mongo4idea](https://github.com/dboissier/mongo4idea) - MongoDB integration in Intellij
* [bravoborja/FocusResize](https://github.com/bravoborja/FocusResize) - A custom animation with scroll listener to recycler views
* [mahmoudparsian/data-algorithms-book](https://github.com/mahmoudparsian/data-algorithms-book) -  MapReduce, Spark, Java, and Scala for Data Algorithms Book
* [tony19/logback-android](https://github.com/tony19/logback-android) - ????The reliable, generic, fast and flexible logging framework for Android
* [awslabs/aws-sdk-android-samples](https://github.com/awslabs/aws-sdk-android-samples) - This repository has samples that demonstrate various aspects of the AWS SDK for Android, you can get the SDK source on Github https://github.com/aws-amplify/aws-sdk-android/
* [FXMisc/RichTextFX](https://github.com/FXMisc/RichTextFX) - Rich-text area for JavaFX
* [good-life/PushTalk](https://github.com/good-life/PushTalk) - ????????????????????????????????? (JPush) ????????????????????????????????????????????????????????????????????? Android????????????iOS???????????? Java???????????????3???????????????????????????????????????
* [FuZhucheng/SSM](https://github.com/FuZhucheng/SSM) - J2EE????????????????????????SSM??????????????????????????????????????????????????????Spring+SpringMVC+MyBatis+Lucene+Redis+MAVEN???
* [borball/weixin-sdk](https://github.com/borball/weixin-sdk) - ??????????????????(?????????????????????????????????????????????)???????????????????????????????????? Java SDK
* [jbake-org/jbake](https://github.com/jbake-org/jbake) - Java based open source static site/blog generator for developers & designers.
* [sukritishah15/DS-Algo-Point](https://github.com/sukritishah15/DS-Algo-Point) - This repository contains codes for various data structures and algorithms in C, C++, Java, Python, C#, Go, JavaScript, PHP, Kotlin and Scala
* [neoremind/fluent-validator](https://github.com/neoremind/fluent-validator) - A Java validation framework leveraging fluent interface style and JSR 303 specification
* [jline/jline3](https://github.com/jline/jline3) - JLine is a Java library for handling console input.
* [Gottox/socket.io-java-client](https://github.com/Gottox/socket.io-java-client) - Socket.IO Client Implementation in Java
* [murraco/spring-boot-jwt](https://github.com/murraco/spring-boot-jwt) - JWT auth service using Spring Boot, Spring??Security and MySQL
* [libgdx/gdx-ai](https://github.com/libgdx/gdx-ai) - Artificial Intelligence framework for games based on libGDX or not. Features: Steering Behaviors, Formation Motion, Pathfinding, Behavior Trees and Finite State Machines
* [playgameservices/android-basic-samples](https://github.com/playgameservices/android-basic-samples) - Google Play game services - Android samples
* [appium/java-client](https://github.com/appium/java-client) - Java language binding for writing Appium Tests, conforms to Mobile JSON Wire & W3C Webdriver Protocol
* [superhj1987/pragmatic-java-engineer](https://github.com/superhj1987/pragmatic-java-engineer) - Java????????????????????? - ??????Java?????????????????????????????????
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
* [InterestingLab/waterdrop](https://github.com/InterestingLab/waterdrop) - ?????????????????????????????????????????????????????????
* [klinker-apps/talon-for-twitter-android](https://github.com/klinker-apps/talon-for-twitter-android) - The most powerful and beautiful Twitter client available.
* [zhangdaiscott/jeecg](https://github.com/zhangdaiscott/jeecg) - JEECG?????????????????????????????????J2EE???????????????????????????????????????????????????????????????????????????????????????????????????????????????(Online Coding??????(???????????????) - > ????????????????????? - > ??????MERGE????????????)??? ??????????????????Java??????90%???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
* [crashub/crash](https://github.com/crashub/crash) - The shell for the Java Platform
* [jfaster/mango](https://github.com/jfaster/mango) - Distributed ORM Framework for Java
* [ernestoyaquello/VerticalStepperForm](https://github.com/ernestoyaquello/VerticalStepperForm) - Vertical Stepper Form Library for Android. It follows Google Material Design guidelines.
* [sword-org/wechat4j](https://github.com/sword-org/wechat4j) - wechat4j is wechat(weixin) develop framework for java ??????????????????JAVA???????????????????????????????????????
* [h4de5ing/AndroidCommon](https://github.com/h4de5ing/AndroidCommon) - ??????Android??????Api?????????????????????
* [facebookarchive/swift](https://github.com/facebookarchive/swift) - An annotation-based Java library for creating Thrift serializable types and services.
* [vladmihalcea/flexy-pool](https://github.com/vladmihalcea/flexy-pool) - FlexyPool adds metrics and failover strategies to a given Connection Pool, allowing it to resize on demand.
* [dieforfree/qart4j](https://github.com/dieforfree/qart4j) - QR code ASCII art for java
* [eclipse-archived/smarthome](https://github.com/eclipse-archived/smarthome) - Eclipse SmartHome??? project
* [google/tink](https://github.com/google/tink) - Tink is a multi-language, cross-platform, open source library that provides cryptographic APIs that are secure, easy to use correctly, and hard(er) to misuse.
* [rzwitserloot/lombok](https://github.com/rzwitserloot/lombok) - Very spicy additions to the Java programming language.
* [eclipse/openj9](https://github.com/eclipse/openj9) - Eclipse OpenJ9: A Java Virtual Machine for OpenJDK that's optimized for small footprint, fast start-up, and high throughput.   Builds on Eclipse OMR (https://github.com/eclipse/omr) and combines with the Extensions for OpenJDK for OpenJ9 repo.
* [Picovoice/porcupine](https://github.com/Picovoice/porcupine) - On-device wake word detection powered by deep learning.
* [awslabs/djl](https://github.com/awslabs/djl) - An Engine-Agnostic Deep Learning Framework in Java
* [youxin11544/MVP-RxJava-Hybride](https://github.com/youxin11544/MVP-RxJava-Hybride) - This is an Android MVP model good architecture design???Which also inherited the Android architecture and HTML 5 interaction??????????????????Android MVP???????????????????????????,???????????????Android???HTML 5????????????????????????RxJava+Retrofit+MVP+????????????mvp+????????????+????????????+???????????????+??????????????? +?????????????????????
* [florent37/AwesomeBar](https://github.com/florent37/AwesomeBar) - Just beautiful
* [Cuieney/kotlin-life](https://github.com/Cuieney/kotlin-life) - App?????????????????? ?????????vr???????????? ????????????Material design???????????????App ???written with java and Kotlin???
* [davidmoten/rtree](https://github.com/davidmoten/rtree) - Immutable in-memory R-tree and R*-tree implementations in Java with reactive api
* [bluejoe2008/openwebflow](https://github.com/bluejoe2008/openwebflow) - ??????Activiti????????????????????????????????????Activiti????????????????????????????????????????????????????????????????????????????????????????????????/???????????????????????????????????????????????????
* [kaitoy/pcap4j](https://github.com/kaitoy/pcap4j) - A Java library for capturing, crafting, and sending packets.
* [bigmeow/JWT](https://github.com/bigmeow/JWT) - webapp???????????????????????? JSON WEB TOKEN ??????Deme?????????Java???
* [PebbleTemplates/pebble](https://github.com/PebbleTemplates/pebble) - Java Template Engine
* [looly/hutool](https://github.com/looly/hutool) - A set of tools that keep Java sweet.
* [wikimedia/apps-android-wikipedia](https://github.com/wikimedia/apps-android-wikipedia) -  ????The official Wikipedia app for Android!
* [akarnokd/RxJavaInterop](https://github.com/akarnokd/RxJavaInterop) - Library to convert between RxJava 1.x and 2.x/3.x reactive types, schedulers and resource handles.
* [Andy671/Dachshund-Tab-Layout](https://github.com/Andy671/Dachshund-Tab-Layout) - Extended Android Tab Layout with animated indicators that have continuous feedback.
* [hibernate/hibernate-validator](https://github.com/hibernate/hibernate-validator) - Hibernate Validator - Jakarta Bean Validation Reference Implementation
* [lionsoul2014/ip2region](https://github.com/lionsoul2014/ip2region) - Ip2region is a offline IP location library with accuracy rate of 99.9% and 0.0x millseconds searching performance. DB file is ONLY a few megabytes with all IP address stored. binding for Java,PHP,C,Python,Nodejs,Golang,C#,lua. Binary,B-tree,Memory searching algorithm
* [apache/lucene-solr](https://github.com/apache/lucene-solr) - Apache Lucene and Solr open-source search software
* [zeebe-io/zeebe](https://github.com/zeebe-io/zeebe) - Distributed Workflow Engine for Microservices Orchestration
* [houko/SpringBootUnity](https://github.com/houko/SpringBootUnity) - rabbitmq???redis???scheduled???socket???mongodb???Swagger2???spring data jpa???Thymeleaf???freemarker etc. (muti module spring boot project) (with spring boot framework???different bussiness scence with different technology???)
* [spotify/heroic](https://github.com/spotify/heroic) - The Heroic Time Series Database
* [airlift/airline](https://github.com/airlift/airline) - Java annotation-based framework for parsing Git like command line structures
* [chatopera/cskefu](https://github.com/chatopera/cskefu) - ???? ??????????????????????????????????????????????????????????????? ??????????????????
* [bugsnag/bugsnag-android](https://github.com/bugsnag/bugsnag-android) - Bugsnag crash monitoring and reporting tool for Android apps
* [litesuits/android-lite-http](https://github.com/litesuits/android-lite-http) - LiteHttp is a simple, intelligent and flexible HTTP framework for Android. With LiteHttp you can make HTTP request with only one line of code! It could convert a java model to the parameter and rander the response JSON as a java model intelligently.
* [michelelacorte/SwipeableCard](https://github.com/michelelacorte/SwipeableCard) - A simple implementation of swipe card like StreetView
* [Orbiter/anomic_ftp_server](https://github.com/Orbiter/anomic_ftp_server) - a simple ftp server in java
* [twitter/Serial](https://github.com/twitter/Serial) - Light-weight, fast framework for object serialization in Java, with Android support.
* [mrdear/JavaWEB](https://github.com/mrdear/JavaWEB) - JavaWEB?????????????????????Demo(??????)
* [0opslab/opslabJutil](https://github.com/0opslab/opslabJutil) - Java utils
* [blipinsk/FlippableStackView](https://github.com/blipinsk/FlippableStackView) - An Android library introducing a stack of Views with the first item being flippable.
* [bbottema/simple-java-mail](https://github.com/bbottema/simple-java-mail) - Simple API, Complex Emails (JavaMail smtp wrapper)
* [apache/sqoop](https://github.com/apache/sqoop) - Mirror of Apache Sqoop
* [xerial/snappy-java](https://github.com/xerial/snappy-java) - Snappy compressor/decompressor for Java
* [kungfoo/geohash-java](https://github.com/kungfoo/geohash-java) - Implementation of GeoHashes in java. We try to be/stay compliant to the spec, as far as possible.
* [pholser/junit-quickcheck](https://github.com/pholser/junit-quickcheck) - Property-based testing, JUnit-style
* [rakam-io/rakam-api](https://github.com/rakam-io/rakam-api) - ???? Collect customer event data from your apps. (Note that this project only includes the API collector, not the visualization platform)
* [apache/mina](https://github.com/apache/mina) - Mirror of Apache MINA
* [wuyouzhuguli/FEBS-Shiro](https://github.com/wuyouzhuguli/FEBS-Shiro) - Spring Boot 2.2.5???Shiro1.4.2 & Layui 2.5.5 ????????????????????????????????????http://47.104.70.138:8080/login
* [line/armeria](https://github.com/line/armeria) - Asynchronous RPC/REST library built on top of Java 8, Netty, HTTP/2, Thrift and gRPC
* [Sable/soot](https://github.com/Sable/soot) - Soot - A Java optimization framework
* [liweiwei1419/LeetCode-Solution-in-Good-Style](https://github.com/liweiwei1419/LeetCode-Solution-in-Good-Style) - ?????? LeetCode ???????????????????????????????????????
* [Martin404/PayMap](https://github.com/Martin404/PayMap) - Java????????????????????????????????????????????????????????????????????????PC???????????????????????????acp???upop????????????????????????????????????????????????
* [MachinePublishers/jBrowserDriver](https://github.com/MachinePublishers/jBrowserDriver) - A programmable, embeddable web browser driver compatible with the Selenium WebDriver spec -- headless, WebKit-based, pure Java
  
  ### `Licenses`
License

[![CC0](http://i.creativecommons.org/p/zero/1.0/88x31.png)](http://creativecommons.org/publicdomain/zero/1.0/)

To the extent possible under law, [Veilair](https://github.com/veilair/) has waived all copyright and related or neighboring rights to this work.
