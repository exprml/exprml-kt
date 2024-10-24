// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: exprml/v1/expr.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package jumpaku.exprml.pb.exprml.v1;

@kotlin.jvm.JvmName("-initializeiter")
public inline fun iter(block: jumpaku.exprml.pb.exprml.v1.IterKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.Iter =
  jumpaku.exprml.pb.exprml.v1.IterKt.Dsl._create(jumpaku.exprml.pb.exprml.v1.Iter.newBuilder()).apply { block() }._build()
/**
 * ```
 * Iter is an Iter expression.
 * ```
 *
 * Protobuf type `exprml.v1.Iter`
 */
public object IterKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: jumpaku.exprml.pb.exprml.v1.Iter.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jumpaku.exprml.pb.exprml.v1.Iter.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jumpaku.exprml.pb.exprml.v1.Iter = _builder.build()

    /**
     * ```
     * PosIdent is the identifier of the position.
     * ```
     *
     * `string pos_ident = 1 [json_name = "posIdent"];`
     */
    public var posIdent: kotlin.String
      @JvmName("getPosIdent")
      get() = _builder.posIdent
      @JvmName("setPosIdent")
      set(value) {
        _builder.posIdent = value
      }
    /**
     * ```
     * PosIdent is the identifier of the position.
     * ```
     *
     * `string pos_ident = 1 [json_name = "posIdent"];`
     */
    public fun clearPosIdent() {
      _builder.clearPosIdent()
    }

    /**
     * ```
     * ElemIdent is the identifier of the element.
     * ```
     *
     * `string elem_ident = 2 [json_name = "elemIdent"];`
     */
    public var elemIdent: kotlin.String
      @JvmName("getElemIdent")
      get() = _builder.elemIdent
      @JvmName("setElemIdent")
      set(value) {
        _builder.elemIdent = value
      }
    /**
     * ```
     * ElemIdent is the identifier of the element.
     * ```
     *
     * `string elem_ident = 2 [json_name = "elemIdent"];`
     */
    public fun clearElemIdent() {
      _builder.clearElemIdent()
    }

    /**
     * ```
     * Col is the collection to iterate.
     * ```
     *
     * `.exprml.v1.Expr col = 3 [json_name = "col"];`
     */
    public var col: jumpaku.exprml.pb.exprml.v1.Expr
      @JvmName("getCol")
      get() = _builder.col
      @JvmName("setCol")
      set(value) {
        _builder.col = value
      }
    /**
     * ```
     * Col is the collection to iterate.
     * ```
     *
     * `.exprml.v1.Expr col = 3 [json_name = "col"];`
     */
    public fun clearCol() {
      _builder.clearCol()
    }
    /**
     * ```
     * Col is the collection to iterate.
     * ```
     *
     * `.exprml.v1.Expr col = 3 [json_name = "col"];`
     * @return Whether the col field is set.
     */
    public fun hasCol(): kotlin.Boolean {
      return _builder.hasCol()
    }
    public val IterKt.Dsl.colOrNull: jumpaku.exprml.pb.exprml.v1.Expr?
      get() = _builder.colOrNull

    /**
     * ```
     * Do is the body of the iteration.
     * ```
     *
     * `.exprml.v1.Expr do = 4 [json_name = "do"];`
     */
    public var do_: jumpaku.exprml.pb.exprml.v1.Expr
      @JvmName("getDo_")
      get() = _builder.`do`
      @JvmName("setDo_")
      set(value) {
        _builder.`do` = value
      }
    /**
     * ```
     * Do is the body of the iteration.
     * ```
     *
     * `.exprml.v1.Expr do = 4 [json_name = "do"];`
     */
    public fun clearDo_() {
      _builder.clearDo()
    }
    /**
     * ```
     * Do is the body of the iteration.
     * ```
     *
     * `.exprml.v1.Expr do = 4 [json_name = "do"];`
     * @return Whether the do field is set.
     */
    public fun hasDo_(): kotlin.Boolean {
      return _builder.hasDo()
    }
    public val IterKt.Dsl.doOrNull: jumpaku.exprml.pb.exprml.v1.Expr?
      get() = _builder.doOrNull

    /**
     * ```
     * If is the condition of the iteration.
     * ```
     *
     * `.exprml.v1.Expr if = 5 [json_name = "if"];`
     */
    public var if_: jumpaku.exprml.pb.exprml.v1.Expr
      @JvmName("getIf_")
      get() = _builder.`if`
      @JvmName("setIf_")
      set(value) {
        _builder.`if` = value
      }
    /**
     * ```
     * If is the condition of the iteration.
     * ```
     *
     * `.exprml.v1.Expr if = 5 [json_name = "if"];`
     */
    public fun clearIf_() {
      _builder.clearIf()
    }
    /**
     * ```
     * If is the condition of the iteration.
     * ```
     *
     * `.exprml.v1.Expr if = 5 [json_name = "if"];`
     * @return Whether the if field is set.
     */
    public fun hasIf_(): kotlin.Boolean {
      return _builder.hasIf()
    }
    public val IterKt.Dsl.ifOrNull: jumpaku.exprml.pb.exprml.v1.Expr?
      get() = _builder.ifOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun jumpaku.exprml.pb.exprml.v1.Iter.copy(block: `jumpaku.exprml.pb.exprml.v1`.IterKt.Dsl.() -> kotlin.Unit): jumpaku.exprml.pb.exprml.v1.Iter =
  `jumpaku.exprml.pb.exprml.v1`.IterKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val jumpaku.exprml.pb.exprml.v1.IterOrBuilder.colOrNull: jumpaku.exprml.pb.exprml.v1.Expr?
  get() = if (hasCol()) getCol() else null

public val jumpaku.exprml.pb.exprml.v1.IterOrBuilder.doOrNull: jumpaku.exprml.pb.exprml.v1.Expr?
  get() = if (hasDo()) getDo() else null

public val jumpaku.exprml.pb.exprml.v1.IterOrBuilder.ifOrNull: jumpaku.exprml.pb.exprml.v1.Expr?
  get() = if (hasIf()) getIf() else null

