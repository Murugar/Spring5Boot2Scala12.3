package com.iqmsoft.module

import scala.beans.BeanProperty

case class Greeting(@BeanProperty id: String, @BeanProperty content: String)
