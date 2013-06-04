/**
 *  Copyright 2013 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wordnik.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Api {
  /** Short description of the class */
  String value();
  String listingPath() default "";
  String listingClass() default "";

  /** General description of this class */
  String description() default "";

  boolean open() default false;

  /** The base path that is prepended to all @Path elements. This may be an override for certain scenarios only */
  String basePath() default "";
  
  int position() default 0;
  String produces() default "";
  String consumes() default "";
  String protocols() default "";
  String authorizations() default "";
}
