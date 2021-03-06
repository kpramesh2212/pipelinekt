[pipelinekt](../../../index.md) / [com.code42.jenkins.pipelinekt.core.stage](../../index.md) / [Stage](../index.md) / [Matrix](./index.md)

# Matrix

`data class Matrix : `[`Stage`](../index.md) [(source)](https://github.com/code42/pipelinekt/tree/master/core/src/main/kotlin/com/code42/jenkins/pipelinekt/core/stage/Stage.kt#L129)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Matrix(name: Str, matrixBody: `[`MatrixBody`](../../-matrix-body/index.md)`, whenBlock: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`When`](../../../com.code42.jenkins.pipelinekt.core/-when.md)`> = emptyList(), options: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`StageOption`](../../../com.code42.jenkins.pipelinekt.core/-stage-option.md)`> = emptyList(), post: `[`Post`](../../../com.code42.jenkins.pipelinekt.core/-post/index.md)` = Post())` |

### Properties

| Name | Summary |
|---|---|
| [agent](agent.md) | `val agent: `[`Agent`](../../../com.code42.jenkins.pipelinekt.core/-agent.md)`?` |
| [matrixBody](matrix-body.md) | `val matrixBody: `[`MatrixBody`](../../-matrix-body/index.md) |
| [name](name.md) | `val name: Str` |
| [options](options.md) | `val options: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`StageOption`](../../../com.code42.jenkins.pipelinekt.core/-stage-option.md)`>` |
| [post](post.md) | `val post: `[`Post`](../../../com.code42.jenkins.pipelinekt.core/-post/index.md) |
| [tools](tools.md) | `val tools: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Tool`](../../../com.code42.jenkins.pipelinekt.core/-tool.md)`>` |
| [whenBlock](when-block.md) | `val whenBlock: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`When`](../../../com.code42.jenkins.pipelinekt.core/-when.md)`>` |

### Functions

| Name | Summary |
|---|---|
| [toGroovy](to-groovy.md) | `fun toGroovy(writer: `[`GroovyWriter`](../../../com.code42.jenkins.pipelinekt.core.writer/-groovy-writer/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
