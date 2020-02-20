/*
 * Copyright 2020 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers.help

import play.api.i18n.Lang
import play.twirl.api.HtmlFormat
import testutil.{Fixture, GenericTestHelper}

class WebchatSpec extends GenericTestHelper {

  trait ViewFixture extends Fixture {
    implicit val lang: Lang = mock[Lang]
    override def view: HtmlFormat.Appendable = views.html.webchat()(request, lang, messages)
  }

  "Webchat" should {
    "have a header of 'Webchat'" in new ViewFixture {
      getElementTextById("page-header") mustBe "Accessibility for webchat"
    }
  }
}