/**
 * Objective-C Language - Enables analysis of Swift and Objective-C projects into SonarQube.
 * Copyright © 2015 Backelite (${email})
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.backelite.sonarqube.objectivec;


public class ObjectiveCConstants {

    // Global Objective C constants
    public static final String FALSE = "false";

    public static final String FILE_SUFFIXES_KEY = "sonar.objectivec.file.suffixes";
    public static final String FILE_SUFFIXES_DEFVALUE = "h,m,mm";

    public static final String PROPERTY_PREFIX = "sonar.objectivec";

    public static final String TEST_FRAMEWORK_KEY = PROPERTY_PREFIX + ".testframework";
    public static final String TEST_FRAMEWORK_DEFAULT = "ghunit";

}