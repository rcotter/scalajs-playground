This is a scala.js playground for learning...fast. Compile and run times are actually reasonable. 

If you are not already
setup for JVM Scala, follow the this [article](https://medium.com/@michaelmangial1/getting-started-with-scala-js-scalavue-and-scalareact-for-the-javascript-developer-ac578ddcb5a8).

Most features work but not all. So have fun but be ready to Google.
E.g. Await.result since it does not translate to node well.


## Code
Modify code under `src`.


## Run
**NOTE** Use a terminal. Not yet working from Intellij SBT console.

**YAY** No explicit compilation needed.

### Once
1. `sbt`
1. `run`

### Watch Mode
Use [sbt-revolver](https://github.com/spray/sbt-revolver)

1. `sbt`
1. `~ reStart`