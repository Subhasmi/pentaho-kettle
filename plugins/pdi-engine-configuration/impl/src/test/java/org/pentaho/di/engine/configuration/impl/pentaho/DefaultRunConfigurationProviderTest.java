/*
 * *****************************************************************************
 *
 *  Pentaho Data Integration
 *
 *  Copyright (C) 2017 by Pentaho : http://www.pentaho.com
 *
 *  *******************************************************************************
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  this file except in compliance with the License. You may obtain a copy of the
 *  License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * *****************************************************************************
 *
 */

package org.pentaho.di.engine.configuration.impl.pentaho;

import org.junit.Before;
import org.junit.Test;
import org.pentaho.di.engine.configuration.api.RunConfiguration;

import static org.junit.Assert.assertEquals;

/**
 * Created by bmorrise on 4/4/17.
 */
public class DefaultRunConfigurationProviderTest {

  private DefaultRunConfigurationProvider defaultRunConfigurationProvider;

  @Before
  public void setup() {
    defaultRunConfigurationProvider = new DefaultRunConfigurationProvider( null );
  }

  @Test
  public void testLoadNullName() {
    RunConfiguration defaultRunConfiguration = defaultRunConfigurationProvider.load( null );

    assertEquals( defaultRunConfiguration.getType(), "Pentaho" );
  }

}
