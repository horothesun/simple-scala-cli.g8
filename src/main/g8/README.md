# $name$

[![CI](https://github.com/$github_org$/$repo_name$/actions/workflows/ci.yml/badge.svg)](https://github.com/$github_org$/$repo_name$/actions/workflows/ci.yml)
[![Scala](https://img.shields.io/badge/Scala-$if(use_scala_3.truthy)$3$else$2.13$endif$-%23DC322F?style=flat&labelColor=%23383838&logo=Scala&logoColor=%23DC322F&logoWidth=12&cacheSeconds=3600)](https://www.scala-lang.org/)

## Setup

Scala-CLI - IDE setup ([IntelliJ IDEA guide](https://scala-cli.virtuslab.org/docs/cookbooks/ide/intellij/))

```bash
scala-cli setup-ide .
```

## Run

```bash
scala-cli .
```

## Test (watch)

```bash
scala-cli test --watch .
```
