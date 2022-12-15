import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { SortingServerService } from './sorting-server.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'sortingFrontend';

  constructor(public sortingServerService: SortingServerService) {}

  public sortNumbersForm: FormGroup = new FormGroup(
    {
      numbersInput: new FormControl("", Validators.required),
      isAscending: new FormControl(false)
    }
  );
  
  private numberList: number[] = [];

  public sortNumbersFormSubmit(): void
  {
    if(true)
    {
      this.numberList = [];
      let num: number = 0;
      let digitProvided: boolean = false;
      let text: string = this.sortNumbersForm.value.numbersInput;
      let isAsc: boolean = this.sortNumbersForm.value.isAscending;
      if(text != null)
      {
        for(let i = 0; i < text.length; i++)
        {
          if(text[i] >= '0' && text[i] <= '9')
          {
            num *= 10;
            num += parseInt(text[i]);
            digitProvided = true
          }
          else
          {
            if(digitProvided)
            {
              this.numberList.push(num);
              num = 0;
            }
            digitProvided = false;
          }
        }
        if(digitProvided)
        {
          this.numberList.push(num);
          num = 0;
        }
      }
      this.sortingServerService.requestFromServer(this.numberList, isAsc);
    }
  }
}
