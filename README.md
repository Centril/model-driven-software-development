[![badge: Build Status]][badge url: Build Status] [![badge: Semver 2.0.0]][badge url: Semver 2.0.0]

# [model-driven-software-development]

Repo for the course [TDA593].

## Table of Contents:
<!-- MarkdownTOC -->

- [Other stuff](#other-stuff)
- [Building the project](#building-the-project)
- [Git branching](#git-branching)

<!-- /MarkdownTOC -->

## Other stuff
 + [Google Drive]
 + [Google Calendar]
 + [Trello], for work that needs to be done - *use GitHub issues for specific bugs.*

## Building the project

For Java related stuff, we use the [Gradle] build system.

First clone the repo to your local computer:
```shell
git clone https://github.com/Centril/model-driven-software-development.git
```

Change directory to the application:
```shell
cd ./application
```

Using gradle:

```shell
./gradlew build # If you want to build the app.
./gradlew run   # If you want to run the app... it will do build before.
./gradlew check # If you want to run all the tests.
```

## Git branching

Feature branches for *everything!*.
**Never** push anything into the `master` branch directly.

When done, make a pull-request into master. You may still commit things into the feature branch while the pull-request is open.

For changes related to Java: [Travis CI] will then automatically test the pull-request, and see if everything is all right.

<!-- references -->

[badge: Build Status]: https://magnum.travis-ci.com/Centril/model-driven-software-development.svg?token=tJzANbfoJzwBBDyvGhPs&branch=master&style=flat
[badge url: Build Status]: https://travis-ci.org/Centril/gradle-plugin-robospock
[badge: Semver 2.0.0]: http://img.shields.io/badge/semver-2.0.0-blue.svg
[badge url: Semver 2.0.0]: http://semver.org/spec/v2.0.0.html

[model-driven-software-development]: https://github.com/Centril/model-driven-software-development
[TDA593]: http://www.cse.chalmers.se/edu/year/2014/course/TDA593/Year2014/project.html
[Google Drive]: https://drive.google.com/drive/#folders/0B8MTUxP-GIBpX2I4dU0xamhRV0U
[Trello]: https://trello.com/b/GDS7Fm6i/model-driven-software-development
[Google Calendar]: https://www.google.com/calendar/render

[Travis CI]: https://magnum.travis-ci.com/Centril/model-driven-software-development

[Gradle]: http://gradle.org/

<!-- references -->
