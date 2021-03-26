import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { LoginComponent } from './login/login.component';
import { NgBootStrapArrowDirective } from './common/directive/ng-boot-strap-arrow.directive';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    NgBootStrapArrowDirective,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
