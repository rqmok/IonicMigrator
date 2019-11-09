import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';

import { MyApp } from './app.component';
import { AddPetPage } from '../pages/add-pet/add-pet';
import { EventPage } from '../pages/event/event';
import { ContactPage } from '../pages/contact/contact';
import { LoginPage } from '../pages/login/login';
import { SignupPage } from '../pages/signup/signup';
import { ProfilePage } from '../pages/profile/profile';
import { FindPetsPage } from '../pages/find-pets/find-pets';
import { MessagePage } from '../pages/message/message';
import { ScheduleMeetupPage } from '../pages/schedule-meetup/schedule-meetup';
import { EditDetailsPage } from '../pages/edit-details/edit-details';
import { EditPasswordPage } from '../pages/edit-password/edit-password';
import { YourPetsPage } from '../pages/your-pets/your-pets';
import { EditPetPage } from '../pages/edit-pet/edit-pet';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { Calendar } from '@ionic-native/calendar';
import { SMS } from '@ionic-native/sms';
import { Contacts } from '@ionic-native/contacts';
import { Camera } from '@ionic-native/camera';

import { AngularFireModule } from '@angular/fire';
import { AngularFireAuth } from '@angular/fire/auth';
import { firebaseConfig } from '../config';
import { AuthProvider } from '../providers/auth/auth';
import { DbProvider } from '../providers/db/db';
import { AngularFireDatabaseModule } from '@angular/fire/database';
import { AngularFireStorageModule } from '@angular/fire/storage'
import { ImageCaptureProvider } from '../providers/image-capture/image-capture';

@NgModule({
  declarations: [
    MyApp,
    FindPetsPage,
    EventPage,
    ScheduleMeetupPage,
    MessagePage,
    ContactPage,
    AddPetPage,
    YourPetsPage,
    LoginPage,
    SignupPage,
    ProfilePage,
    EditDetailsPage,
    EditPasswordPage,
    EditPetPage
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
    AngularFireModule.initializeApp(firebaseConfig),
    AngularFireDatabaseModule,
    AngularFireStorageModule
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    FindPetsPage,
    YourPetsPage,
    ScheduleMeetupPage,
    MessagePage,
    EventPage,
    ContactPage,
    AddPetPage,
    LoginPage,
    SignupPage,
    ProfilePage,
    EditDetailsPage,
    EditPasswordPage,
    EditPetPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    { provide: ErrorHandler, useClass: IonicErrorHandler },
    Calendar,
    Contacts,
    AngularFireAuth,
    AuthProvider,
    DbProvider,
    Camera,
    SMS,
    Contacts,
    ImageCaptureProvider
  ]
})
export class AppModule { }
