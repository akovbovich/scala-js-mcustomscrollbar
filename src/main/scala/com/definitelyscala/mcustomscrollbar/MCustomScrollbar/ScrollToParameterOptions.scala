package com.definitelyscala.mcustomscrollbar.MCustomScrollbar

import scala.scalajs.js

@js.native
trait ScrollToParameterOptions extends js.Object {
  /**
   * Scroll-to animation speed, value in milliseconds
   */
  var scrollInertia: Double = js.native
  /**
   * Scroll-to animation easing, values: "linear", "easeOut", "easeInOut".
   */
  var scrollEasing: String = js.native
  /**
   * Scroll scrollbar dragger (instead of content) to a number of pixels, values: true, false
   */
  var moveDragger: Boolean = js.native
  /**
   * Set a timeout for the method (the default timeout is 60 ms in order to work with automatic scrollbar update), value in milliseconds.
   */
  var timeout: Double = js.native
  /**
   * Trigger user defined callback after scroll-to completes, value: true, false
   */
  var callbacks: Boolean = js.native
}