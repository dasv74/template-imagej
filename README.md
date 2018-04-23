# template-imagej
Template for a ImageJ plugin (legacy)
This is an example Maven project implementing an ImageJ 1.x plugin.

However you build the project, in the end you will have the `.jar` file
(called *artifact* in Maven speak) in the `target/` subdirectory.

To copy the artifact into the correct place, you can call
`mvn -Dimagej.app.directory=/path/to/ImageJ.app/`.
This will not only copy your artifact, but also all the dependencies. Restart
your ImageJ or call *Help>Refresh Menus* to see your plugin in the menus.


How to use this project as a starting point
===========================================

Either

* `git clone git://github.com/imagej/example-legacy-plugin`, or
* unpack https://github.com/imagej/example-legacy-plugin/archive/master.zip

Then:

1. Edit the `pom.xml` file. Every entry should be pretty self-explanatory.
   In particular, change
    1. the *artifactId* (**NOTE**: should contain a '_' character)
    2. the *groupId*, ideally to a reverse domain name your organization owns
    3. the *version* (note that you typically want to use a version number
       ending in *-SNAPSHOT* to mark it as a work in progress rather than a
       final version)
    4. the *dependencies* (read how to specify the correct
       *groupId/artifactId/version* triplet
       [here](https://imagej.net/Maven#How_to_find_a_dependency.27s_groupId.2FartifactId.2Fversion_.28GAV.29.3F))
    5. the *developer* information
    6. the *scm* information
2. Remove the `Process_Pixels.java` file and add your own `.java` files
   to `src/main/java/<package>/` (if you need supporting files -- like icons
   -- in the resulting `.jar` file, put them into `src/main/resources/`)
3. Edit `src/main/resources/plugins.config`
4. Replace the contents of `README.md` with information about your project.


If you cloned the `example-legacy-plugin` repository, you probably want to
publish the result in your own repository:

1. Call `git status` to verify .gitignore lists all the files (or file
   patterns) that should be ignored
2. Call `git add .` and `git add -u` to stage the current files for
   commit
3. Call `git commit` or `git gui` to commit the changes
4. [Create a new GitHub repository](https://github.com/new)
5. `git remote set-url origin git@github.com:<username>/<projectname>`
6. `git push origin HEAD`

### Eclipse: To ensure that Maven copies the plugin to your ImageJ folder

1. Go to _Run Configurations..._
2. Choose _Maven Build_
3. Add the following parameter:
    - name: `imagej.app.directory`
    - value: `/path/to/ImageJ.app/`

This ensures that the final `.jar` file will also be copied to your ImageJ
plugins folder everytime you run the Maven Build
