package com.main.overview.achitecturecollection

trait Builder [-Elem, +To]{
  def +=(elem: Elem): this.type
  def result(): To
  def clear(): Unit
  def mapResult[NewTo](f: To => NewTo): Builder[Elem, NewTo]
}