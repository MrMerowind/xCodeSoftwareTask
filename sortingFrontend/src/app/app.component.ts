import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'sortingFrontend';

  sortNumbersForm: FormGroup = new FormGroup(
    {
      numbersInput: new FormControl("", Validators.compose([Validators.required, Validators.pattern("/^[0-9\,\s]$/")])),
      isAscending: new FormControl(false)
    }
  );
}
