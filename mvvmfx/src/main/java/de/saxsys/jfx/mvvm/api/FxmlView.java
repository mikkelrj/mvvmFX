/*******************************************************************************
 * Copyright 2013 Alexander Casall, Manuel Mauky
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.saxsys.jfx.mvvm.api;

import de.saxsys.jfx.mvvm.base.view.View;

/**
 * A view that is implemented with FXML. There has to be an fxml file with the same name (case-insensitive) in the same
 * package that contains the view declaration.
 * 
 * @param <ViewModelType>
 *            the type of the viewModel.
 * 
 * @author manuel.mauky
 */
public interface FxmlView<ViewModelType extends ViewModel> extends View<ViewModelType> {
}
