package com.definitelyscala.mcustomscrollbar

import scala.scalajs.js

@js.native
trait JQuery extends js.Object {
  /**
   * Calls specified methods on the scrollbar "update", "stop", "disable", "destroy"
   *
   * @param method Method name to call on scrollbar e.g. "update", "stop"
   */
  def mCustomScrollbar(method: String): JQuery = js.native
  /**
   * Calls the scrollTo method on the scrollbar
   *
   * @param scrollTo Method name as a string "scrollTo"
   * @param parameter String or pixel integer value to specify where to scroll to e.g. "bottom", "top" or 20
   * @param options Override default options
   */
  def mCustomScrollbar(scrollTo: String, parameter: js.Any, options: MCustomScrollbar.ScrollToParameterOptions): JQuery = js.native
  /**
   * Creates a new mCustomScrollbar with the specified or default options
   *
   * @param options Override default options
   */
  def mCustomScrollbar(options: MCustomScrollbar.CustomScrollbarOptions): JQuery = js.native
}