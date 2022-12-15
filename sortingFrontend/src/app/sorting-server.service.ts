import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SortServerRequest, SortServerResponse } from './sort-server-request';

@Injectable({
  providedIn: 'root'
})
export class SortingServerService {

  constructor(private httpClient: HttpClient) { }

  public sortedNumbers: number[] = [];

  public requestFromServer(n: number[], asc: boolean): void
  {
    this.sortedNumbers = [];
    let ssrq: SortServerRequest = new SortServerRequest();
    ssrq.numbers = n;
    if(asc) ssrq.order = "ASC"

    let result: SortServerResponse = new SortServerResponse();

    this.httpClient.post<SortServerResponse>("http://localhost:8080/numbers/sort-command", ssrq).subscribe(p => {if(p.numbers.length > 0) this.sortedNumbers = p.numbers});
  }
}
