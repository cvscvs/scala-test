package com.main.overview.valueclsuniversaltrait.extensionmethod

class RichInt (val self: Int) extends AnyVal{
  def toHexString: String = java.lang.Integer.toHexString(self)
}